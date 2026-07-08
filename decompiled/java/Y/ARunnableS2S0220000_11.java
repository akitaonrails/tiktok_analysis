package Y;

import X.C1839820xye;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS2S0220000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", ((VideoItemParams) this.l0).getAweme().getAid());
            c2344009Gk.LJIIIIZZ("author_id", ((VideoItemParams) this.l0).getAweme().getAuthor().getUid());
            c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) this.l0).mEventType);
            c2344009Gk.LJIIIIZZ("target_lang", C1839820xye.LIZ().LIZ());
            c2344009Gk.LJIIIIZZ("title_source_lang", ((VideoItemParams) this.l0).getAweme().getDescLanguage());
            c2344009Gk.LIZJ(1, "has_title_rich_text");
            Map map = (Map) this.l1;
            if (map == null || (str = (String) map.get("richTextType")) == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("title_rich_text_type", str);
            c2344009Gk.LIZJ(this.z2 ? 1 : 0, "is_title_rich_text_translatable");
            c2344009Gk.LIZJ(this.z3 ? 1 : 0, "is_title_rich_text_translated");
            C20684815ws.LJIILLIIL("click_title_rich_text", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9 A[PHI: r1
      0x01e9: PHI (r1v35 java.lang.String) = (r1v0 java.lang.String), (r1v36 java.lang.String) binds: [B:23:0x0069, B:21:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S0220000_11.LIZ$1():void");
    }

    public static final void run$0(ARunnableS2S0220000_11 aRunnableS2S0220000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoDescVM@4a37.onMTSpanClick$$inlined$postMobEvent$1");
        try {
            aRunnableS2S0220000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoDescVM@4a37.onMTSpanClick$$inlined$postMobEvent$1");
    }

    public static final void run$1(ARunnableS2S0220000_11 aRunnableS2S0220000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeDetailFragment@2398.onFirstFrameLoaded$reportRunnable$1");
        try {
            aRunnableS2S0220000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeDetailFragment@2398.onFirstFrameLoaded$reportRunnable$1");
    }

    public ARunnableS2S0220000_11(Object obj, Object obj2, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
        this.z3 = z2;
    }
}
