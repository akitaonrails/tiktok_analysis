package X;

import android.content.Context;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AwS292S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0ZYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901600ZYo implements InterfaceC1329405Ie<InterfaceC1329505If> {
    public final C0Z7Z LIZ;
    public final ConcurrentLinkedDeque<C901670ZYv> LIZIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentHashMap<String, C901670ZYv> LIZJ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final String LJ = "IMVoicePreloader";
    public final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ);
    public final String LJI = "voice";
    public final ConcurrentHashMap<String, SimVideoUrlModel> LJII = new ConcurrentHashMap<>();
    public final Set<String> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set<String> LJIIIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // X.InterfaceC1329405Ie
    public final void release() {
    }

    @Override // X.InterfaceC1329405Ie
    public final void reset() {
    }

    @Override // X.InterfaceC1329405Ie
    public final String LIZIZ() {
        return this.LJI;
    }

    public C901600ZYo(C0Z7Z c0z7z) {
        this.LIZ = c0z7z;
    }

    public static String LJFF(C869590Y9l c869590Y9l) {
        C0YC6 next;
        MediaURLStruct mediaURLStruct;
        List<String> list;
        String str;
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.index < 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc6 = next;
            if (c0yc6 != null && (mediaURLStruct = c0yc6.mediaUrlStruct) != null && (list = mediaURLStruct.url_list) != null && (str = (String) C13LP.LJJJLZIJ(0, list)) != null && str.length() > 0) {
                return str;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1329405Ie
    public final void LIZ(List<? extends InterfaceC1329505If> list) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C901620ZYq(list, this, null), 3);
    }

    public final void LJI(String str) {
        if (this.LIZJ.containsKey(str)) {
            this.LIZJ.remove(str);
            this.LIZLLL.decrementAndGet();
            C23250099c.LIZLLL(this.LJFF, null, null, new C901650ZYt(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C901600ZYo.LJIIIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1329405Ie
    public final void LJJIIJ(String str) {
        Object c098200Yq;
        Unit unit;
        IMVoiceMessageUtil.LIZ.getClass();
        Integer numRemove = IMVoiceMessageUtil.LJIIIIZZ.remove(str);
        if (numRemove != null) {
            int iIntValue = numRemove.intValue();
            try {
                IMDownloadAPI.LIZ.getClass();
                IMDownloadAPI value = C901170ZWx.LIZIZ.getValue();
                if (value != null) {
                    value.LIZJ(iIntValue);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LJIIIIZZ.remove(str);
        SimVideoUrlModel simVideoUrlModelRemove = this.LJII.remove(str);
        if (simVideoUrlModelRemove != null) {
            try {
                C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelRemove);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (this.LIZJ.remove(str) != null) {
            this.LIZLLL.decrementAndGet();
        }
    }

    public final SimVideoUrlModel LIZLLL(String str, String str2) {
        this.LJIIIZ.add(str);
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.setSourceId(str);
        IMVoiceMessageUtil.LIZ.getClass();
        simVideoUrlModel.setUrlKey(String.valueOf(str.hashCode()));
        simVideoUrlModel.setUrlList(Collections.singletonList(str2));
        simVideoUrlModel.setFormat("mp3");
        return simVideoUrlModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, X.08oU] */
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
    public final void LJ(C901670ZYv c901670ZYv, String str) {
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ2;
        C0I0B.LJFF.LIZJ();
        Context contextLIZ = C894660Z7w.LIZ();
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ2 = iIMPreloadService.LIZIZ()) != null) {
            interfaceC1335605KoLIZIZ2.LIZIZ(c901670ZYv.LIZ, this.LJI);
        }
        C259800zU c259800zU = new C259800zU();
        ?? c2230008oU = new C2230008oU(c901670ZYv.LIZ, null, null == true ? 1 : 0, null == true ? 1 : 0, 0, Long.valueOf(System.currentTimeMillis()), null == true ? 1 : 0, null == true ? 1 : 0, "preload", null == true ? 1 : 0, 393014);
        c259800zU.element = c2230008oU;
        try {
            IMVoiceMessageUtil.LIZ.LJ(c901670ZYv.LIZIZ, contextLIZ, str, c901670ZYv.LIZ, c2230008oU, new AwS415S0200000_14(c901670ZYv, this, 133), new AwS292S0300000_14(c259800zU, (C259800zU<C2230008oU>) c901670ZYv, (C901670ZYv) this, (C901600ZYo) 5));
            C23250099c.LIZLLL(this.LJFF, null, null, new C901630ZYr(this, c901670ZYv, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IIMPreloadService iIMPreloadService2 = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
            if (iIMPreloadService2 != null && (interfaceC1335605KoLIZIZ = iIMPreloadService2.LIZIZ()) != null) {
                interfaceC1335605KoLIZIZ.onFailed(c901670ZYv.LIZ);
            }
            LJI(c901670ZYv.LIZ);
        }
    }

    public final boolean LJII(String str, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C1478160oZK.LIZ().LJIIIIZZ(LIZLLL(str, str2)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C901670ZYv r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C901600ZYo.LJIIIIZZ(X.0ZYv, java.lang.String):void");
    }

    public final void LIZJ(C901670ZYv c901670ZYv, String str, String str2) {
        if (!this.LJIIIIZZ.add(c901670ZYv.LIZ)) {
            return;
        }
        C23250099c.LIZLLL(this.LJFF, null, null, new C901610ZYp(this, c901670ZYv, str, str2, null), 3);
    }
}
