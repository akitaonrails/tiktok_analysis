package Y;

import X.C835850Wqd;
import X.C851460Xai;
import X.C851480Xak;
import X.InterfaceC1041760dDS;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.kakao.KakaoAuth;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS529S0100000_13 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS529S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS529S0100000_13 aObjectS529S0100000_13, Object obj, Object obj2) {
        String str = (String) obj2;
        C835850Wqd.LIZ.getClass();
        ((ArrayList) C835850Wqd.LJII).add(str);
        C835850Wqd.LIZIZ();
        ((InterfaceC1041760dDS) aObjectS529S0100000_13.l0).LIZ(((Integer) obj).intValue(), str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Xah] */
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
    public static final Object invoke$1(AObjectS529S0100000_13 aObjectS529S0100000_13, Object obj, Object obj2) {
        C851480Xak c851480Xak;
        final KakaoAuth kakaoAuth = (KakaoAuth) aObjectS529S0100000_13.l0;
        final C851460Xai c851460Xai = (C851460Xai) obj;
        Throwable th = (Throwable) obj2;
        kakaoAuth.getClass();
        if (th != null) {
            if ("KakaoTalk is installed but not connected to Kakao account.".equals(th.getMessage())) {
                c851480Xak = new C851480Xak(9, new Exception(th));
            } else {
                c851480Xak = new C851480Xak(new Exception(th));
            }
            c851480Xak.setCancelled("user cancelled.".equals(th.getMessage()));
            kakaoAuth.vQ2(c851480Xak);
            return null;
        }
        if (c851460Xai == null) {
            kakaoAuth.vQ2(new C851480Xak(3, "oauth token missing"));
            return null;
        }
        kakaoAuth.LLILZ.LJFF(new Function2() { // from class: X.0Xah
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                KakaoAuth kakaoAuth2 = kakaoAuth;
                C851460Xai c851460Xai2 = c851460Xai;
                C851470Xaj c851470Xaj = (C851470Xaj) obj3;
                Throwable th2 = (Throwable) obj4;
                kakaoAuth2.getClass();
                if (th2 != null) {
                    C851480Xak c851480Xak2 = new C851480Xak(new Exception(th2));
                    c851480Xak2.setCancelled(false);
                    kakaoAuth2.vQ2(c851480Xak2);
                    return null;
                }
                if (c851470Xaj == null) {
                    kakaoAuth2.vQ2(new C851480Xak(3, "access token missing"));
                    return null;
                }
                C2193741AtQ c2193741AtQ = new C2193741AtQ(kakaoAuth2.LLILLL.LIZIZ, 1);
                c2193741AtQ.LIZ = true;
                c2193741AtQ.LJ = c851460Xai2.LIZ;
                c2193741AtQ.LJI = c851460Xai2.LIZIZ.getTime();
                c2193741AtQ.LIZLLL = String.valueOf(c851470Xaj.LIZ);
                kakaoAuth2.LLILZIL.xQ2(new AuthResult(c2193741AtQ));
                return null;
            }
        });
        return null;
    }
}
