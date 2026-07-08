package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896070ZDh {
    public static final boolean LIZ(C869590Y9l c869590Y9l, Function0<Integer> function0) {
        if (c869590Y9l.getTtl() <= 0 && c869590Y9l.getMsgType() == 40 && !C0ZDX.LJJIIJ(c869590Y9l)) {
            return true;
        }
        if (c869590Y9l.getTtl() > 0) {
            if (function0.invoke().intValue() > c869590Y9l.getTtl()) {
                return true;
            }
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null) {
            long j = baseTemplateLIZ.Nc().ttlComponent.expiredAt;
            if (j > 0 && function0.invoke().intValue() > j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l, EnumC898050ZKx enumC898050ZKx) {
        Object c098200Yq;
        Integer numValueOf;
        if (c869590Y9l == null) {
            return true;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null) {
            numValueOf = Integer.valueOf(orParseJsonContent.type);
        } else {
            Object obj = null;
            try {
                String str = (String) ((Map) C051M.LIZ.LJIIIIZZ(c869590Y9l.getContent(), new TypeToken<Map<String, ? extends String>>() { // from class: X.0ZD6
                }.getType())).get("aweType");
                if (str != null) {
                    c098200Yq = C2095008Iq.LJIIJJI(str);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            numValueOf = (Integer) obj;
        }
        if (numValueOf == null) {
            return true;
        }
        if (numValueOf.intValue() != 710) {
            if (numValueOf.intValue() != 709 || c869590Y9l.getMsgId() > 0) {
                return true;
            }
            if (((Number) C270220AiS.LIZ.getValue()).intValue() == 1) {
                switch (C898040ZKw.LIZIZ[enumC898050ZKx.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        throw new C1954807lC();
                }
            }
        }
        return false;
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l, EnumC898060ZKy enumC898060ZKy) {
        Object c098200Yq;
        Integer numValueOf;
        int i;
        if (c869590Y9l == null) {
            return false;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null) {
            numValueOf = Integer.valueOf(orParseJsonContent.type);
        } else {
            Object obj = null;
            try {
                String str = (String) ((Map) C051M.LIZ.LJIIIIZZ(c869590Y9l.getContent(), new TypeToken<Map<String, ? extends String>>() { // from class: X.0ZDi
                }.getType())).get("aweType");
                if (str != null) {
                    c098200Yq = C2095008Iq.LJIIJJI(str);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            numValueOf = (Integer) obj;
        }
        if (numValueOf == null) {
            return false;
        }
        if (numValueOf.intValue() != 710) {
            if (numValueOf.intValue() != 709 || c869590Y9l.getMsgId() > 0) {
                return false;
            }
            if (((Number) C270220AiS.LIZ.getValue()).intValue() == 1 && (i = C898040ZKw.LIZ[enumC898060ZKy.ordinal()]) != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    return false;
                }
                throw new C1954807lC();
            }
        }
        return true;
    }
}
