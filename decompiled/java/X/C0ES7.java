package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ES7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.core.EditStickerScene$processRecentUsedSticker$1$1", f = "EditStickerScene.kt", l = {2355, 2377, 2383, 2389}, m = "invokeSuspend")
public final class C0ES7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1635170seZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ C1634780sdw LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1462070o9N LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ES7(Effect effect, C1634780sdw c1634780sdw, String str, C1462070o9N c1462070o9N, InterfaceC1364105Vn<? super C0ES7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effect;
        this.LLILZ = c1634780sdw;
        this.LLILZIL = str;
        this.LLILZLL = c1462070o9N;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ES7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1635170seZ c1635170seZ;
        List<String> tags;
        String str;
        String strLIZIZ;
        String str2;
        String str3;
        String str4;
        String str5;
        C560530Lyd<C1635170seZ> c560530LydJ60;
        String str6;
        C1C7U.LIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1635170seZ = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String effect_id = this.LLILLL.getEffect_id();
            String str7 = this.LLILZ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String resourceId = this.LLILLL.getResourceId();
            String str8 = (String) C13LP.LJJJLL(this.LLILLL.getIconUrl().getUrlList());
            List<String> tags2 = this.LLILLL.getTags();
            if (tags2 == null) {
                tags2 = C13BV.INSTANCE;
            }
            c1635170seZ = new C1635170seZ(str7, jCurrentTimeMillis, resourceId, null, str8, effect_id, null, null, null, tags2, 24273);
            if (C1462570oAB.LJ(this.LLILLL)) {
                C1634780sdw c1634780sdw = this.LLILZ;
                if (!(!c1634780sdw.LIZJ().LJI(c1634780sdw.LIZ).isEmpty())) {
                    C1634780sdw c1634780sdw2 = this.LLILZ;
                    C1635170seZ c1635170seZLIZ = C1635170seZ.LIZ(c1635170seZ, 0, null, true, null, this.LLILLL.getExtra(), null, 32191);
                    this.LL = c1635170seZ;
                    this.LLILLJJLI = 1;
                    if (c1634780sdw2.LIZLLL(c1635170seZLIZ, this) == objLJFF) {
                        C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                        return objLJFF;
                    }
                }
            }
        }
        if (C123100dR.LIZ(this.LLILZIL) && ((tags = this.LLILLL.getTags()) == null || !tags.contains("time"))) {
            ConcurrentHashMap<String, Object> concurrentHashMapLIZ = C178100mJ.LIZ(this.LLILZIL);
            if (concurrentHashMapLIZ != null) {
                String str9 = this.LLILZ.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Object obj2 = concurrentHashMapLIZ.get("path");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                Object obj3 = concurrentHashMapLIZ.get("path");
                if ((obj3 instanceof String) && (str6 = (String) obj3) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("file://");
                    sbLIZ.append(str6);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                Object obj4 = concurrentHashMapLIZ.get("stickerId");
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                Object obj5 = concurrentHashMapLIZ.get("width");
                if (obj5 instanceof String) {
                    str3 = (String) obj5;
                } else {
                    str3 = null;
                }
                Object obj6 = concurrentHashMapLIZ.get("height");
                if (obj6 instanceof String) {
                    str4 = (String) obj6;
                } else {
                    str4 = null;
                }
                C1635170seZ c1635170seZ2 = new C1635170seZ(str9, jCurrentTimeMillis2, null, str, strLIZIZ, null, str2, str3, str4, null, 25545);
                InterfaceC1465230oET interfaceC1465230oET = this.LLILZLL.LLLLLLIL;
                if (interfaceC1465230oET != null && (c560530LydJ60 = interfaceC1465230oET.J60()) != null) {
                    c560530LydJ60.LJIIIZ(c1635170seZ2);
                }
                Object obj7 = concurrentHashMapLIZ.get("cutout");
                if (obj7 instanceof String) {
                    str5 = (String) obj7;
                } else {
                    str5 = null;
                }
                if (!Boolean.parseBoolean(str5)) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                    return unit2;
                }
                C1634780sdw c1634780sdw3 = this.LLILZ;
                this.LL = null;
                this.LLILLJJLI = 2;
                if (c1634780sdw3.LIZLLL(c1635170seZ2, this) == objLJFF) {
                    C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                    return objLJFF;
                }
            }
        } else if (C1462570oAB.LJIJI(this.LLILLL)) {
            C1634780sdw c1634780sdw4 = this.LLILZ;
            C1635170seZ c1635170seZLIZ2 = C1635170seZ.LIZ(c1635170seZ, 0, this.LLILLL.getId(), false, (String) ListProtector.get(this.LLILLL.getFileUrl().getUrlList(), 0), null, this.LLILLL.getUnzipPath(), 16247);
            this.LL = null;
            this.LLILLJJLI = 3;
            if (c1634780sdw4.LIZLLL(c1635170seZLIZ2, this) == objLJFF) {
                C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                return objLJFF;
            }
        } else {
            C1634780sdw c1634780sdw5 = this.LLILZ;
            this.LL = null;
            this.LLILLJJLI = 4;
            if (c1634780sdw5.LIZLLL(c1635170seZ, this) == objLJFF) {
                C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditStickerScene@bf5d.processRecentUsedSticker$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
