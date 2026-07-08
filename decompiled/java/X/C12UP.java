package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.12UP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UP extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public int LL;
    public Context LLILLJJLI;
    public List<C0WIY<String, C0WIY<Integer, Integer>>> LLILZ;
    public final C12UU LLILZIL;
    public List<VideoSegment> LLIZ;
    public MutableLiveData<Bitmap> LLIZLLLIL;
    public MutableLiveData<Boolean> LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public final C19560811fy LLJILJILJ;
    public final boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJIII;
    public InterfaceC1452170ntP LLJJIJI;
    public final HashMap<String, Float> LLILLL = new HashMap<>();
    public List<VideoSegment> LLILZLL = new ArrayList();
    public final List<Bitmap> LLJJI = new ArrayList();

    public final void LLLFZ() {
        if (this.LLJJIII) {
            int iLLLI = LLLI((int) ((VideoSegment) ListProtector.get(this.LLILZLL, 0)).duration, ((VideoSegment) ListProtector.get(this.LLILZLL, 0)).LJFF(true));
            if (iLLLI <= 0) {
                return;
            }
            Object objH2 = C786410Ut5.H2(this.LLILLJJLI, Scene.SCENE_SERVICE);
            Context contextLIZIZ = objH2 instanceof Scene ? C545820Lau.LIZIZ((Scene) objH2) : this.LLILLJJLI;
            MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
            mvChooseCoverBitmapCreator.setNeedCompileFrame(this.LLJILLL);
            mvChooseCoverBitmapCreator.setImgSize(this.LLJI, this.LLJIJIL);
            mvChooseCoverBitmapCreator.setFirstFrameVisibleLiveData(this.LLJ);
            mvChooseCoverBitmapCreator.setFirstFrameBitmapLiveData(this.LLIZLLLIL);
            mvChooseCoverBitmapCreator.getBitmapList(contextLIZIZ, this.LLJJIJI, iLLLI, new InterfaceC741260T5w() { // from class: X.12UO
                @Override // X.InterfaceC741260T5w
                public final void LIZ(List list) {
                    C12UP c12up = this.LIZ;
                    c12up.getClass();
                    if (list != null && !list.isEmpty()) {
                        ((ArrayList) c12up.LLJJI).clear();
                        ((ArrayList) c12up.LLJJI).addAll(list);
                        c12up.notifyDataSetChanged();
                    }
                }
            });
        }
        notifyDataSetChanged();
    }

    public final void LLLIIIIL() {
        C12UU c12uu = this.LLILZIL;
        if (c12uu != null) {
            c12uu.LIZIZ();
        }
    }

    public final void LLLIL() {
        List<C0WIY<String, C0WIY<Integer, Integer>>> list = this.LLILZ;
        if (list == null) {
            this.LLILZ = new ArrayList();
        } else {
            list.clear();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.LLILZLL.size(); i2++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLILZLL, i2);
            int iLLLI = this.LL == 1 ? LLLI((int) (videoSegment.LIZLLL() - videoSegment.LJII()), videoSegment.LJFF(true)) : LLLI((int) videoSegment.duration, videoSegment.LJFF(true));
            Integer numValueOf = Integer.valueOf(i);
            i += iLLLI;
            this.LLILZ.add(new C0WIY<>(videoSegment.LJFF(true), new C0WIY(numValueOf, Integer.valueOf(i - 1))));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLJJIII) {
            return ((ArrayList) this.LLJJI).size();
        }
        C19560811fy c19560811fy = this.LLJILJILJ;
        if (c19560811fy != null) {
            return c19560811fy.LIZLLL;
        }
        if (C2401009ay.LIZ(this.LLILZLL)) {
            return 0;
        }
        int iLLLI = 0;
        for (int i = 0; i < this.LLILZLL.size(); i++) {
            iLLLI += this.LL == 1 ? LLLI((int) (((VideoSegment) ListProtector.get(this.LLILZLL, i)).end - ((VideoSegment) ListProtector.get(this.LLILZLL, i)).start), ((VideoSegment) ListProtector.get(this.LLILZLL, i)).LJFF(true)) : LLLI((int) ((VideoSegment) ListProtector.get(this.LLILZLL, i)).duration, ((VideoSegment) ListProtector.get(this.LLILZLL, i)).LJFF(true));
        }
        return iLLLI;
    }

    public final void LLLIILIL(HashMap<String, Float> map) {
        for (String str : map.keySet()) {
            this.LLILLL.put(str, Float.valueOf(map.get(str).floatValue() * this.LLJI));
        }
        C12UU c12uu = this.LLILZIL;
        if (c12uu != null) {
            c12uu.LIZIZ();
        }
        LLLIL();
        LLLFZ();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C12UQ) {
            C1323050kX9.LJII(((C12UQ) viewHolder).LLILLJJLI);
        }
    }

    public C12UP(Context context, C12US c12us) {
        this.LLJILLL = false;
        int[] iArr = c12us.LIZ;
        this.LLJI = iArr[0];
        this.LLJIJIL = iArr[1];
        this.LLJILJIL = iArr[2];
        this.LLJILLL = c12us.LJFF;
        List<VideoSegment> list = c12us.LIZIZ;
        HashMap<String, Float> map = c12us.LIZJ;
        int i = c12us.LIZLLL;
        this.LLILLJJLI = context;
        this.LL = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(list, i2);
            this.LLILLL.put(videoSegment.LJFF(true), Float.valueOf(map.get(videoSegment.LJFF(true)).floatValue() * this.LLJI));
        }
        this.LLIZ = list;
        C19560811fy c19560811fy = c12us.LJ;
        if (c19560811fy != null) {
            this.LLJILJILJ = c19560811fy;
            this.LLILZIL = new C576700Mjc(c19560811fy);
        } else {
            this.LLILZIL = new VEMediaParserFrameProviderImpl(context);
        }
    }

    public final int LLLI(int i, String str) {
        float fFloatValue;
        if (this.LLILLL.get(str) != null) {
            fFloatValue = this.LLILLL.get(str).floatValue();
            if (fFloatValue <= 0.0f) {
            }
            return (int) Math.ceil(i / fFloatValue);
        }
        fFloatValue = -1.0f;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("duration: ");
        sbLIZ.append(i);
        sbLIZ.append(" oneFrameDurMap");
        sbLIZ.append(this.LLILLL.get(str));
        sbLIZ.append(" path: ");
        sbLIZ.append(str);
        interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
        return (int) Math.ceil(i / fFloatValue);
    }

    public final void LLLII(HashMap map, VideoSegment videoSegment) {
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLILZLL).add(videoSegment);
        LLLIILIL(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float fMin;
        float fLIZLLL;
        float fFloatValue;
        final int i2 = i;
        if (viewHolder instanceof C12UQ) {
            if (this.LLJJ) {
                int itemCount = getItemCount();
                int i3 = (itemCount - i2) - 1;
                if (i3 >= 0 && i3 < itemCount) {
                    i2 = i3;
                }
            }
            if (this.LLJILJILJ != null) {
                final C12UQ c12uq = (C12UQ) viewHolder;
                c12uq.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c12uq.LL.getLayoutParams();
                C12UP c12up = c12uq.LLILLL;
                marginLayoutParams.height = c12up.LLJIJIL;
                marginLayoutParams.width = c12up.LLJILJILJ.LJ;
                C786410Ut5.c6(c12uq.LL, marginLayoutParams);
                c12uq.LL.setImageBitmap(null);
                c12uq.LL.setBackgroundColor(c12uq.LLILLL.LLILLJJLI.getResources().getColor(R.color.fn));
                C12UP c12up2 = c12uq.LLILLL;
                if (c12up2.LLJJIII) {
                    c12uq.LL.setImageBitmap((Bitmap) ListProtector.get(c12up2.LLJJI, i2));
                    if (i2 == c12uq.LLILLL.getItemCount() - 1) {
                        c12uq.I5((Bitmap) ListProtector.get(c12uq.LLILLL.LLJJI, i2));
                        return;
                    }
                    return;
                }
                C12UU c12uu = c12up2.LLILZIL;
                if (c12uu == null) {
                    return;
                }
                c12uu.LIZJ(i2, "", 0, new C0L3L() { // from class: X.12UT
                    @Override // X.C0L3L
                    public final void LIZ(C1323050kX9 c1323050kX9) {
                        C12UQ c12uq2 = c12uq;
                        boolean z = true;
                        if (i2 != c12uq2.LLILLL.getItemCount() - 1) {
                            z = false;
                        }
                        c12uq2.L5(c1323050kX9, z);
                    }
                });
                return;
            }
            final C12UQ c12uq2 = (C12UQ) viewHolder;
            c12uq2.LLILLL.LLLIL();
            C12UP c12up3 = c12uq2.LLILLL;
            for (int i4 = 0; i4 < ((ArrayList) c12up3.LLILZ).size(); i4++) {
                C0WIY c0wiy = (C0WIY) ((C0WIY) ListProtector.get(c12up3.LLILZ, i4)).LIZIZ;
                if (i2 >= ((Integer) c0wiy.LIZ).intValue() && i2 <= ((Integer) c0wiy.LIZIZ).intValue()) {
                    if (i4 < 0) {
                        return;
                    }
                    final C0WIY c0wiy2 = (C0WIY) ((C0WIY) ListProtector.get(c12uq2.LLILLL.LLILZ, i4)).LIZIZ;
                    if (c12uq2.LLILLL.LL == 1) {
                        float fIntValue = i2 - ((Integer) c0wiy2.LIZ).intValue();
                        C12UP c12up4 = c12uq2.LLILLL;
                        fMin = Math.min((fIntValue * c12up4.LLILLL.get(((VideoSegment) ListProtector.get(c12up4.LLILZLL, i4)).LJFF(true)).floatValue()) + ((VideoSegment) ListProtector.get(c12uq2.LLILLL.LLILZLL, i4)).LJII(), ((VideoSegment) ListProtector.get(c12uq2.LLILLL.LLILZLL, i4)).LIZLLL());
                    } else {
                        float fIntValue2 = i2 - ((Integer) c0wiy2.LIZ).intValue();
                        C12UP c12up5 = c12uq2.LLILLL;
                        fMin = Math.min(fIntValue2 * c12up5.LLILLL.get(((VideoSegment) ListProtector.get(c12up5.LLILZLL, i4)).LJFF(true)).floatValue(), ((VideoSegment) ListProtector.get(c12uq2.LLILLL.LLILZLL, i4)).duration);
                    }
                    int i5 = (int) fMin;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i4);
                    sbLIZ.append("-");
                    sbLIZ.append(i5);
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c12uq2.LL.setTag(strLIZIZ);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c12uq2.LL.getLayoutParams();
                    C12UP c12up6 = c12uq2.LLILLL;
                    marginLayoutParams2.height = c12up6.LLJIJIL;
                    marginLayoutParams2.width = c12up6.LLJI;
                    if (i2 == ((Integer) c0wiy2.LIZIZ).intValue()) {
                        C12UP c12up7 = c12uq2.LLILLL;
                        if (c12up7.LL == 1) {
                            fLIZLLL = ((VideoSegment) ListProtector.get(c12up7.LLILZLL, i4)).LIZLLL() - ((VideoSegment) ListProtector.get(c12uq2.LLILLL.LLILZLL, i4)).LJII();
                            C12UP c12up8 = c12uq2.LLILLL;
                            fFloatValue = c12up8.LLILLL.get(((VideoSegment) ListProtector.get(c12up8.LLILZLL, i4)).LJFF(true)).floatValue();
                        } else {
                            fLIZLLL = ((VideoSegment) ListProtector.get(c12up7.LLILZLL, i4)).duration;
                            C12UP c12up9 = c12uq2.LLILLL;
                            fFloatValue = c12up9.LLILLL.get(((VideoSegment) ListProtector.get(c12up9.LLILZLL, i4)).LJFF(true)).floatValue();
                        }
                        float f = fLIZLLL % fFloatValue;
                        C12UP c12up10 = c12uq2.LLILLL;
                        marginLayoutParams2.width = (int) (((double) (f / c12up10.LLILLL.get(((VideoSegment) ListProtector.get(c12up10.LLILZLL, i4)).LJFF(true)).floatValue())) * ((double) c12uq2.LLILLL.LLJI));
                    }
                    C786410Ut5.c6(c12uq2.LL, marginLayoutParams2);
                    c12uq2.LL.setImageBitmap(null);
                    c12uq2.LL.setBackgroundColor(c12uq2.LLILLL.LLILLJJLI.getResources().getColor(R.color.fn));
                    C12UP c12up11 = c12uq2.LLILLL;
                    if (c12up11.LLJJIII) {
                        c12uq2.LL.setImageBitmap((Bitmap) ListProtector.get(c12up11.LLJJI, i2));
                        return;
                    }
                    final String strLJFF = ((VideoSegment) ListProtector.get(c12up11.LLILZLL, i4)).LJFF(false);
                    C12UP c12up12 = c12uq2.LLILLL;
                    C12UU c12uu2 = c12up12.LLILZIL;
                    if (c12uu2 == null) {
                        return;
                    }
                    String strLJFF2 = ((VideoSegment) ListProtector.get(c12up12.LLILZLL, i4)).LJFF(true);
                    for (int i6 = 0; i6 < c12uq2.LLILLL.LLIZ.size() && !strLJFF2.equals(((VideoSegment) ListProtector.get(c12uq2.LLILLL.LLIZ, i6)).LJFF(true)); i6++) {
                    }
                    c12uu2.LIZJ(i2, strLJFF, i5, new C0L3L() { // from class: X.12UR
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C0L3L
                        public final void LIZ(C1323050kX9 c1323050kX9) {
                            C12UQ c12uq3 = c12uq2;
                            C12UQ c12uq4 = c12uq2;
                            String str = strLIZIZ;
                            int i7 = i2;
                            C0WIY c0wiy3 = c0wiy2;
                            String str2 = strLJFF;
                            c12uq3.getClass();
                            ImageView imageView = c12uq4.LL;
                            if (imageView != null && imageView.getTag().equals(str)) {
                                c12uq3.L5(c1323050kX9, false);
                            }
                            if (i7 == ((Integer) c0wiy3.LIZIZ).intValue()) {
                                c12uq3.LLILLL.LLILZIL.LIZLLL(str2);
                            }
                        }
                    });
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12UQ c12uq = new C12UQ(this, viewGroup);
        try {
            View view = c12uq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c12uq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c12uq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C12UQ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c12uq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c12uq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C12UQ.class.getName();
        return c12uq;
    }
}
