package X;

import Y.AfS191S0100000_22;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447610nm3 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final C19560811fy LLILZ;
    public final C11JF LLILZIL;
    public final Pair<Integer, Bitmap>[] LLILZLL;
    public boolean LLIZ;
    public final int LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.length / this.LLILLL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ImageView imageView = (ImageView) viewHolder.itemView;
        int i2 = 0 + i;
        Pair<Integer, Bitmap>[] pairArr = this.LLILZLL;
        Bitmap second = null;
        if (i2 > pairArr.length) {
            imageView.setImageBitmap(null);
            return;
        }
        if (pairArr[0 + i] == null) {
            Pair<Integer, Bitmap> pair = pairArr[0];
            if (pair != null) {
                second = pair.getSecond();
            }
            imageView.setImageBitmap(second);
            return;
        }
        Pair<Integer, Bitmap> pair2 = pairArr[i + 0];
        if (pair2 != null) {
            second = pair2.getSecond();
        }
        imageView.setImageBitmap(second);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ft9, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.LLILLJJLI;
        layoutParams.width = this.LL;
        C786410Ut5.c6(imageView, layoutParams);
        C810403Eo c810403Eo = new C810403Eo(imageView);
        try {
            View view = c810403Eo.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c810403Eo.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c810403Eo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C810403Eo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c810403Eo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c810403Eo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C810403Eo.class.getName();
        return c810403Eo;
    }

    public C1447610nm3(InterfaceC1447630nm5 interfaceC1447630nm5, int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        C19560811fy c19560811fy = new C19560811fy(interfaceC1447630nm5, i, i2, interfaceC1447630nm5.LIZ());
        this.LLILZ = c19560811fy;
        this.LLILZLL = new Pair[c19560811fy.LIZLLL + 1];
        this.LLIZ = true;
        this.LLIZLLLIL = interfaceC1447630nm5.LIZ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZIL = (C11JF) c19560811fy.LIZ().LJJZ(new AfS191S0100000_22(this, 3), new C09JN() { // from class: X.0nm2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("VideoCoverAdapter@782f.<init>$2");
                C1C7U.LIZIZ("VideoCoverAdapter@782f.<init>$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0nm4
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C1447610nm3 c1447610nm3 = this.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1447610nm3.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "tool_performance_video_adapter_extract_cover_time");
                c0lab.LIZIZ(jCurrentTimeMillis2, "totaltime");
                c0lab.LIZ(1, "totalstep");
                C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
            }
        });
    }
}
