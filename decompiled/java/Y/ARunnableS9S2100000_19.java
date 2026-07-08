package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS9S2100000_19 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
        String str = this.s0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", this.s1);
        c2344009Gk.LJIIIIZZ("banner_position", "top");
        c2344009Gk.LJIIIIZZ("trend_id", ((BannerDisplayInfo) this.l2).trendId);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0ies, X.0oiS] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ies, X.0oiS] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0iex, X.0ogN] */
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
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S2100000_19.LIZ$1():void");
    }

    public static final void run$0(ARunnableS9S2100000_19 aRunnableS9S2100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoTopicBannerViewHolder@d7ad.logEvent$1");
        try {
            aRunnableS9S2100000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoTopicBannerViewHolder@d7ad.logEvent$1");
    }

    public static final void run$1(ARunnableS9S2100000_19 aRunnableS9S2100000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBackgroundComponent@e625.showVideoBackground$1");
        try {
            aRunnableS9S2100000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBackgroundComponent@e625.showVideoBackground$1");
    }

    public ARunnableS9S2100000_19(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
    }
}
