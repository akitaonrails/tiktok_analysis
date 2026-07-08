package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$prefetchDistinctDependencies$2$2$1", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {325}, m = "invokeSuspend")
public final class C1343705Nr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C1343805Ns> LLILLL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343705Nr(List<C1343805Ns> list, LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, String str, InterfaceC1364105Vn<? super C1343705Nr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = lyricStickerEffectDownloadServiceImpl;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1343705Nr c1343705Nr = new C1343705Nr(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1343705Nr.LLILLJJLI = obj;
        return c1343705Nr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        Object c098200Yq;
        String str;
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJI = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C1343805Ns> list = this.LLILLL;
            String str2 = this.LLILZIL;
            LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            for (C1343805Ns c1343805Ns : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('#');
                sbLIZ.append(c1343805Ns.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Effect effect = lyricStickerEffectDownloadServiceImpl.LIZIZ.get(strLIZIZ);
                boolean z = false;
                if (effect != null) {
                    try {
                        c098200Yq = Boolean.valueOf(((InterfaceC1635390sev) lyricStickerEffectDownloadServiceImpl.LIZ.getValue()).LJIIIIZZ(effect));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = false;
                    }
                    if (((Boolean) c098200Yq).booleanValue()) {
                        z = true;
                    }
                }
                if (z) {
                    str = null;
                } else if (effect != null) {
                    lyricStickerEffectDownloadServiceImpl.LIZIZ.remove(strLIZIZ);
                    str = c1343805Ns.LIZIZ;
                } else {
                    str = c1343805Ns.LIZIZ;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            List<String> listLJJJJI = C13LP.LJJJJI(arrayList);
            if (listLJJJJI.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2$2$1");
                return unit;
            }
            LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl2 = this.LLILZ;
            String str3 = this.LLILZIL;
            this.LL = 1;
            objLJI = lyricStickerEffectDownloadServiceImpl2.LJI(str3, listLJJJJI, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2$2$1");
                return objLJFF;
            }
        }
        LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl3 = this.LLILZ;
        String str4 = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(objLJI)) {
            for (Effect effect2 : (List) objLJI) {
                String resourceId = effect2.getResourceId();
                if (resourceId != null) {
                    ConcurrentHashMap<String, Effect> concurrentHashMap = lyricStickerEffectDownloadServiceImpl3.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str4);
                    sbLIZ2.append('#');
                    sbLIZ2.append(resourceId);
                    concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), effect2);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
