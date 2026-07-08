package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1045650dJj implements InterfaceC1019050ccp, InterfaceC1045710dJp {
    public final InterfaceC1045690dJn LIZ;
    public final InterfaceC1045710dJp LIZIZ;
    public View LIZJ;
    public Aweme LIZLLL;

    @Override // X.InterfaceC1045710dJp
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC1045710dJp
    public final void LJI(Function2<? super String, ? super String, Unit> function2) {
        this.LIZIZ.LJI(function2);
    }

    @Override // X.InterfaceC1045710dJp
    public final void LJIIIIZZ() {
        this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1045710dJp
    public final Function2<String, String, Unit> LJIIIZ() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1045710dJp
    public final boolean LJIIJJI() {
        return this.LIZIZ.LJIIJJI();
    }

    @Override // X.InterfaceC1045710dJp
    public final Function0<Long> LJIILJJIL() {
        return this.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1045710dJp
    public final void LJIILLIIL() {
        this.LIZIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC1045710dJp
    public final View LJJI() {
        return this.LIZIZ.LJJI();
    }

    @Override // X.InterfaceC1045710dJp
    public final void LJJIFFI(Function0<Long> function0) {
        this.LIZIZ.LJJIFFI(function0);
    }

    @Override // X.InterfaceC1045710dJp
    public final void LJJII(Function0<Long> function0) {
        this.LIZIZ.LJJII(function0);
    }

    @Override // X.InterfaceC1045710dJp
    public final boolean LJJIIJZLJL() {
        return this.LIZIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC1045710dJp
    public final boolean LJJIIZ() {
        return this.LIZIZ.LJJIIZ();
    }

    @Override // X.InterfaceC1045710dJp
    public final Function0<Long> getDuration() {
        return this.LIZIZ.getDuration();
    }

    @Override // X.InterfaceC1045710dJp
    public final String getScene() {
        return this.LIZIZ.getScene();
    }

    @Override // X.InterfaceC1045710dJp
    public final Function0<C1045870dK5> getTracker() {
        return this.LIZIZ.getTracker();
    }

    @Override // X.InterfaceC1045710dJp
    public final void setScene(String str) {
        this.LIZIZ.setScene(str);
    }

    @Override // X.InterfaceC1045710dJp
    public final void setTracker(Function0<C1045870dK5> function0) {
        this.LIZIZ.setTracker(function0);
    }

    @Override // X.InterfaceC1019050ccp
    public final View LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1019050ccp
    public final Aweme getAweme() {
        return this.LIZLLL;
    }

    public C1045650dJj(InterfaceC1045690dJn interfaceC1045690dJn) {
        InterfaceC1045710dJp interfaceC1045710dJp = new InterfaceC1045710dJp() { // from class: X.0dJy
            public String LIZ = "others";
            public boolean LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL;
            public Function2<? super String, ? super String, Unit> LJ;
            public Function0<Long> LJFF;
            public Function0<Long> LJI;
            public Function0<C1045870dK5> LJII;

            @Override // X.InterfaceC1045710dJp
            public final void LIZLLL() {
                this.LIZIZ = true;
            }

            @Override // X.InterfaceC1045710dJp
            public final void LJIIIIZZ() {
                this.LIZLLL = true;
            }

            @Override // X.InterfaceC1045710dJp
            public final void LJIILLIIL() {
                this.LIZJ = true;
            }

            @Override // X.InterfaceC1045710dJp
            public final View LJJI() {
                return null;
            }

            @Override // X.InterfaceC1045710dJp
            public final Function2<String, String, Unit> LJIIIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC1045710dJp
            public final boolean LJIIJJI() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1045710dJp
            public final Function0<Long> LJIILJJIL() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1045710dJp
            public final boolean LJJIIJZLJL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1045710dJp
            public final boolean LJJIIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1045710dJp
            public final Function0<Long> getDuration() {
                return this.LJI;
            }

            @Override // X.InterfaceC1045710dJp
            public final String getScene() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1045710dJp
            public final Function0<C1045870dK5> getTracker() {
                return this.LJII;
            }

            @Override // X.InterfaceC1045710dJp
            public final void LJI(Function2<? super String, ? super String, Unit> function2) {
                this.LJ = function2;
            }

            @Override // X.InterfaceC1045710dJp
            public final void LJJIFFI(Function0<Long> function0) {
                this.LJI = function0;
            }

            @Override // X.InterfaceC1045710dJp
            public final void LJJII(Function0<Long> function0) {
                this.LJFF = function0;
            }

            @Override // X.InterfaceC1045710dJp
            public final void setScene(String str) {
                this.LIZ = str;
            }

            @Override // X.InterfaceC1045710dJp
            public final void setTracker(Function0<C1045870dK5> function0) {
                this.LJII = function0;
            }
        };
        this.LIZ = interfaceC1045690dJn;
        this.LIZIZ = interfaceC1045710dJp;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1045720dJq LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045650dJj.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme):X.0dJq");
    }

    @Override // X.InterfaceC1019050ccp
    public final boolean LJIILL(Aweme aweme) {
        if (this.LIZ.LIZIZ(LJJIIZI(aweme)) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJIJJ(InterfaceC1019050ccp interfaceC1019050ccp) {
        this.LIZ.LJIIIIZZ(interfaceC1019050ccp);
    }

    public View LJJIJ(Activity activity) {
        return activity.findViewById(R.id.trr);
    }

    @Override // X.InterfaceC1019050ccp
    public final void LIZIZ(Context context, Aweme aweme) {
        this.LIZ.LJIIL(context, LJJIIZI(aweme));
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJ(View view, Aweme aweme) {
        this.LIZJ = view;
        this.LIZLLL = aweme;
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJIJ(Context context, Aweme aweme) {
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        this.LIZ.LJIIL(context, LJJIIZI(aweme));
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJJ(Context context, Aweme aweme) {
        this.LIZ.LJIIJJI(LJJIIZI(aweme), context);
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJJIII(Context context, Aweme aweme) {
        this.LIZ.LJIIIZ(context, LJJIIZI(aweme));
    }

    public final List<View> LJJIJIIJI(Context context, View view) {
        Activity activityLIZ = C06MM.LIZ(context);
        if (activityLIZ == null) {
            return C13BV.INSTANCE;
        }
        View viewFindViewById = activityLIZ.getWindow().getDecorView().findViewById(android.R.id.content);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(activityLIZ);
        int iLJIIJ = C12ES.LJIIJ(activityLIZ);
        List<View> listLIZJ = C1045680dJm.LIZJ(iLJIIIIZZ, iLJIIJ, viewFindViewById);
        ArrayList arrayList = (ArrayList) listLIZJ;
        arrayList.remove(view);
        View viewLJJIJ = LJJIJ(activityLIZ);
        if (viewLJJIJ != null) {
            arrayList.removeAll(C1045680dJm.LIZJ(iLJIIIIZZ, iLJIIJ, viewLJJIJ));
        }
        return listLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // X.InterfaceC1019050ccp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.content.Context r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045650dJj.LJIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // X.InterfaceC1019050ccp
    public final void LJJIIJ(int i, Context context, Aweme aweme) {
        this.LIZ.LJIILIIL(LJJIIZI(aweme), context, i);
    }

    @Override // X.InterfaceC1019050ccp
    public final void LIZJ(Context context, View view, Aweme aweme, String str) {
        this.LIZ.LJII(LJJIIZI(aweme), view, LJJIJIIJI(context, view), str);
    }

    @Override // X.InterfaceC1019050ccp
    public void LJFF(int i, Context context, View view, Aweme aweme) {
        this.LIZ.LJIIJ(LJJIIZI(aweme), context, i);
    }

    @Override // X.InterfaceC1019050ccp
    public void LJIIJ(int i, Context context, View view, Aweme aweme) {
        this.LIZ.LJFF(LJJIIZI(aweme), context, i, view);
    }

    @Override // X.InterfaceC1019050ccp
    public void LJIIZILJ(int i, Context context, View view, Aweme aweme) {
        this.LIZ.LIZ(LJJIIZI(aweme), context, i);
    }

    @Override // X.InterfaceC1019050ccp
    public void LJIJJLI(Context context, View view, Aweme aweme, boolean z) {
        C1045720dJq c1045720dJqLJJIIZI = LJJIIZI(aweme);
        if (z) {
            this.LIZ.LIZJ(context, c1045720dJqLJJIIZI);
        } else {
            this.LIZ.LJIIL(context, c1045720dJqLJJIIZI);
        }
    }
}
