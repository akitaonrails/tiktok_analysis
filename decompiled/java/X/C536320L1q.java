package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536320L1q extends AbstractC21673619ry<C536340L1s> {
    public final Context LL;
    public final VEMediaParserProviderV2 LLILLJJLI;
    public final int LLILLL;
    public float LLILZ;
    public final List<Pair<Integer, Integer>> LLILZIL = new ArrayList();
    public List<VideoSegment> LLILZLL = new ArrayList();
    public final int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public float LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLILZLL.isEmpty()) {
            return 0;
        }
        return this.LLJ;
    }

    public final int LLLI(float f) {
        int iLIZIZ;
        int iLIZIZ2;
        ((ArrayList) this.LLILZIL).clear();
        if (this.LLILLL == 1) {
            iLIZIZ = 0;
            for (VideoSegment videoSegment : (ArrayList) this.LLILZLL) {
                float fCeil = (float) Math.ceil(((videoSegment.LIZLLL() - videoSegment.LJII()) / videoSegment.LJI()) / this.LLILZ);
                if (Float.isNaN(fCeil)) {
                    iLIZIZ2 = 0;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(fCeil);
                }
                List<Pair<Integer, Integer>> list = this.LLILZIL;
                Integer numValueOf = Integer.valueOf(iLIZIZ);
                iLIZIZ += iLIZIZ2;
                ((ArrayList) list).add(new Pair(numValueOf, Integer.valueOf(iLIZIZ - 1)));
            }
        } else {
            this.LLJI = ((VideoSegment) ListProtector.get(this.LLILZLL, 0)).LJI();
            if (f != 0.0f) {
                this.LLJI = f;
            }
            float fCeil2 = (float) Math.ceil((r1.duration / this.LLJI) / this.LLILZ);
            if (Float.isNaN(fCeil2)) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(fCeil2);
            }
            ((ArrayList) this.LLILZIL).add(new Pair(0, Integer.valueOf(iLIZIZ - 1)));
        }
        return iLIZIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C536340L1s c536340L1s = (C536340L1s) viewHolder;
        super.onViewRecycled(c536340L1s);
        c536340L1s.LL.setImageBitmap(null);
        Bitmap bitmap = c536340L1s.LLILLJJLI;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        c536340L1s.LLILLJJLI = null;
    }

    public final void LLLFZ(float f, float f2) {
        this.LLILZ = f * this.LLIZ;
        this.LLJ = LLLI(f2);
        this.LLILLJJLI.LIZ();
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float fMin;
        float fFloatValue;
        final C536340L1s c536340L1s = (C536340L1s) viewHolder;
        int size = ((ArrayList) c536340L1s.LLILLL.LLILZIL).size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) ListProtector.get(c536340L1s.LLILLL.LLILZIL, i2);
            if (i >= ((Number) pair.getFirst()).intValue() && i <= ((Number) pair.getSecond()).intValue()) {
                Pair pair2 = (Pair) ListProtector.get(c536340L1s.LLILLL.LLILZIL, i2);
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(c536340L1s.LLILLL.LLILZLL, i2);
                if (c536340L1s.LLILLL.LLILLL == 1) {
                    fMin = Math.min(((i - ((Number) pair2.getFirst()).intValue()) * c536340L1s.LLILLL.LLILZ * videoSegment.LJI()) + videoSegment.LJII(), videoSegment.LIZLLL());
                } else {
                    float fIntValue = i - ((Number) pair2.getFirst()).intValue();
                    C536320L1q c536320L1q = c536340L1s.LLILLL;
                    fMin = Math.min(fIntValue * c536320L1q.LLILZ * c536320L1q.LLJI, videoSegment.duration);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append('-');
                sbLIZ.append(fMin);
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c536340L1s.LL.setTag(strLIZIZ);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c536340L1s.itemView.getLayoutParams();
                C536320L1q c536320L1q2 = c536340L1s.LLILLL;
                marginLayoutParams.height = c536320L1q2.LLIZLLLIL;
                marginLayoutParams.width = c536320L1q2.LLIZ;
                if (i == ((Number) pair2.getSecond()).intValue()) {
                    C536320L1q c536320L1q3 = c536340L1s.LLILLL;
                    if (c536320L1q3.LLILLL == 1) {
                        fFloatValue = ((videoSegment.LIZLLL() - videoSegment.LJII()) / videoSegment.LJI()) - (c536340L1s.LLILLL.LLILZ * (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue()));
                    } else {
                        fFloatValue = (videoSegment.duration / c536320L1q3.LLJI) - (c536320L1q3.LLILZ * ((Number) pair2.getSecond()).floatValue());
                    }
                    if (fFloatValue >= 0.0f) {
                        marginLayoutParams.width = C814420VxA.LIZIZ((fFloatValue / c536340L1s.LLILLL.LLILZ) * r1.LLIZ);
                    }
                }
                C786410Ut5.W5(c536340L1s.itemView, marginLayoutParams);
                Bitmap bitmap = c536340L1s.LLILLJJLI;
                if (bitmap != null && bitmap.isRecycled()) {
                    ImageView imageView = c536340L1s.LL;
                    C536320L1q c536320L1q4 = c536340L1s.LLILLL;
                    if (c536320L1q4.LLILLL == 1) {
                        imageView.setBackground(c536320L1q4.LL.getResources().getDrawable(R.drawable.aal));
                    } else {
                        imageView.setBackground(c536320L1q4.LL.getResources().getDrawable(R.drawable.aar));
                    }
                }
                c536340L1s.LLILLL.LLILLJJLI.LIZIZ(i, ((VideoSegment) ListProtector.get(c536340L1s.LLILLL.LLILZLL, i2)).LJFF(false), (int) fMin, new InterfaceC534950KyT() { // from class: X.0L1r
                    @Override // X.InterfaceC534950KyT
                    public final void LIZ(Bitmap bitmap2) {
                        if (Intrinsics.LJFF(c536340L1s.LL.getTag(), strLIZIZ)) {
                            c536340L1s.LL.setImageBitmap(bitmap2);
                            Bitmap bitmap3 = c536340L1s.LLILLJJLI;
                            if (bitmap3 != null) {
                                bitmap3.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
                            }
                            c536340L1s.LLILLJJLI = bitmap2;
                        }
                    }
                }, true);
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("unknow pos = ");
        sbLIZ2.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C536340L1s c536340L1s = new C536340L1s(this, C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.f891cx4, viewGroup, false));
        try {
            View view = c536340L1s.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c536340L1s.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c536340L1s.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C536340L1s.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c536340L1s.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c536340L1s.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C536340L1s.class.getName();
        return c536340L1s;
    }

    public C536320L1q(Context context, int[] iArr, float f, VEMediaParserProviderV2 vEMediaParserProviderV2, int i) {
        this.LL = context;
        this.LLILLJJLI = vEMediaParserProviderV2;
        this.LLILLL = i;
        int i2 = iArr[0];
        this.LLIZ = i2;
        this.LLIZLLLIL = iArr[1];
        this.LLILZ = f * i2;
    }
}
