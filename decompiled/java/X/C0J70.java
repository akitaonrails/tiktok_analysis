package X;

import Y.ALAdapterS2S0300000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J70, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J70 implements C0J9E {
    public final Context LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public View LIZLLL;
    public Room LJ;
    public C0P0T LJI;
    public C0J72 LJII;
    public boolean LJIIIIZZ;
    public final ArrayList<InterfaceC482890Iwh> LJFF = new ArrayList<>();
    public final C01GW LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, new C482900Iwi(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C0J73());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 822));

    public final String LIZIZ() {
        return (String) this.LJIIIZ.getValue();
    }

    public final boolean LJI() {
        return Intrinsics.LJFF(this.LIZIZ, "coldstart") || Intrinsics.LJFF(this.LIZIZ, "newfollow") || Intrinsics.LJFF(this.LIZIZ, "toplive_core") || Intrinsics.LJFF(this.LIZIZ, "social_core") || Intrinsics.LJFF(this.LIZIZ, "game_core");
    }

    @Override // X.C0J9E
    public final void LLZZ() {
        if (!LJI()) {
            LIZJ(0L);
            return;
        }
        C0P0T c0p0t = this.LJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.C0J9E
    public final boolean isShowing() {
        if (!LJI()) {
            return C500260Jjc.LJJJJIZL(this.LJII);
        }
        C0P0T c0p0t = this.LJI;
        if (c0p0t != null) {
            return c0p0t.isShowing();
        }
        return false;
    }

    public final void LIZJ(long j) {
        C0J72 c0j72;
        View view = this.LIZLLL;
        if (view != null && (c0j72 = this.LJII) != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(c0j72, (Property<C0J72, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration, duration2);
            animatorSet.addListener(new ALAdapterS2S0300000_7(view, c0j72, this, 3));
            animatorSet.setStartDelay(j);
            animatorSet.start();
        }
    }

    public final void LJFF(boolean z) {
        long jIntValue;
        Room room;
        C0IVO c0ivo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            jIntValue = C274990Aq9.LIZ();
        } else {
            jIntValue = ((long) ((Number) C256710A4f.LIZ.getValue()).intValue()) * 1000;
        }
        long j = jCurrentTimeMillis + jIntValue;
        InterfaceC482440Ivy interfaceC482440IvyUt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut();
        if (interfaceC482440IvyUt != null) {
            if (z) {
                room = this.LJ;
            } else {
                room = null;
            }
            String str = this.LIZJ;
            if (Intrinsics.LJFF(this.LIZIZ, "newfollow")) {
                c0ivo = C0IVO.FOLLOW_SCENE;
            } else {
                c0ivo = C0IVO.COLD_START;
            }
            C486690J6t c486690J6t = (C486690J6t) interfaceC482440IvyUt;
            C486730J6x c486730J6x = c486690J6t.LIZ().get(c0ivo.getKey());
            if (c486730J6x == null) {
                c0ivo.getKey();
                c486730J6x = new C486730J6x(7);
                c486690J6t.LIZ().put(c0ivo.getKey(), c486730J6x);
            }
            if (room != null) {
                c486730J6x.LIZ = room;
            }
            C486730J6x c486730J6x2 = c486730J6x;
            c486730J6x2.LIZIZ = j;
            c486730J6x2.LIZJ = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r12.LIZIZ, "newfollow") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r8 = r12.LIZ.getString(2131856809);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r1 = r12.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r3 = new int[]{0, 0};
        r4 = new X.C1391550mJd((android.content.Context) r12.LJIIJJI.getValue());
        r4.LLILLJJLI.LIZIZ = r1;
        r4.LJIIIIZZ(r3[0] + r13, r3[1] + r14);
        r3 = new X.C450650Hln((android.content.Context) r12.LJIIJJI.getValue());
        X.C450650Hln.LJ(r3, r8, com.zhiliaoapp.musically.R.attr.o1);
        r3.setCustomImage(new kotlin.jvm.internal.AwS586S0100000_7(r12, 585));
        r3.LIZIZ(X.EnumC450670Hlp.MEDIUM);
        r4.LLILLJJLI.LJIIZILJ = r3;
        r4.LJII(com.zhiliaoapp.musically.R.attr.f509o0);
        r0 = X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(8));
        r1 = r4.LLILLJJLI;
        r1.LJIIIIZZ = r0;
        r1.LIZLLL = X.EnumC1235690iGF.BOTTOM;
        r0 = X.C274990Aq9.LIZ();
        r3 = r4.LLILLJJLI;
        r3.LJII = r0;
        r3.LJIJJ = false;
        X.C1905770zh1.LIZJ(r4, LIZIZ(), true, new Y.ACListenerS142S0100000_7(r12, 327));
        r3 = LIZIZ();
        r5 = X.EnumC1584360rKc.TOP_LIVE;
        X.C1905770zh1.LIZIZ(r4, r3, r5, new kotlin.jvm.internal.AwS551S0100000_7(r12, 820));
        X.C1905770zh1.LIZ(r4, LIZIZ(), r5, new kotlin.jvm.internal.AwS586S0100000_7(r12, 586));
        com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00de, code lost:
    
        if (com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIIJ() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e0, code lost:
    
        r5 = r12.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r5.getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r3 = r0.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        r2 = ((androidx.fragment.app.Fragment) r3).getView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fc, code lost:
    
        if ((r2 instanceof android.view.ViewGroup) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        r2 = (android.view.ViewGroup) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
    
        r4.LLILLJJLI.LIZJ = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0106, code lost:
    
        r12.LJI = r4.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
    
        if (com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r5.getContext()) == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0155, code lost:
    
        r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r5.getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0161, code lost:
    
        if (X.C294780Bgy.LIZ() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0165, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016a, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
    
        if (((X.InterfaceC214897198d) r1).getEnableSAF() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0175, code lost:
    
        r3 = X.C946803n0.LIZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
    
        r0 = r3.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0181, code lost:
    
        r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if (X.C294780Bgy.LIZ() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018d, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0191, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0195, code lost:
    
        if ((r1 instanceof X.InterfaceC214897198d) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019d, code lost:
    
        if (((X.InterfaceC214897198d) r1).getEnableSAF() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a1, code lost:
    
        if (r3 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a5, code lost:
    
        if ((r3 instanceof X.InterfaceC214902198i) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a7, code lost:
    
        r3 = (X.InterfaceC214902198i) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a9, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ad, code lost:
    
        r3 = r3.getParentFragment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b6, code lost:
    
        if (X.C500260Jjc.LJJIIZ(null) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bc, code lost:
    
        r8 = r12.LIZ.getString(2131841006);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0J72, android.view.View] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0J9E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J70.LIZ(int, int):void");
    }

    public C0J70(C19EG c19eg, String str, String str2) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    public static void LJ(Room room, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_show");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "follow_scene");
        }
        if (room != null) {
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        }
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL(Room room, String str, String str2, String str3) {
        Long lValueOf;
        this.LJIIIIZZ = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_click");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "follow_scene");
        }
        c474500IjALIZ.LJJII(str3, "click_type");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LIZ();
    }
}
