package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ES6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.panel.EditorProStickerPanelAdapterComponent$processRecentUsedSticker$1$1", f = "EditorProStickerPanelAdapterComponent.kt", l = {278, 289, 302}, m = "invokeSuspend")
public final class C0ES6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1635170seZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1634780sdw LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ES6(C1634780sdw c1634780sdw, Effect effect, String str, InterfaceC1364105Vn<? super C0ES6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1634780sdw;
        this.LLILZ = effect;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ES6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1635170seZ c1635170seZ;
        String str;
        String str2;
        String strLIZIZ;
        String str3;
        String str4;
        String str5;
        String str6;
        C1C7U.LIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1635170seZ = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str7 = this.LLILLL.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String resourceId = this.LLILZ.getResourceId();
            String str8 = (String) C13LP.LJJJLL(this.LLILZ.getIconUrl().getUrlList());
            List<String> tags = this.LLILZ.getTags();
            if (tags == null) {
                tags = C13BV.INSTANCE;
            }
            c1635170seZ = new C1635170seZ(str7, jCurrentTimeMillis, resourceId, null, str8, null, null, null, null, tags, 24529);
            if (C1462570oAB.LJ(this.LLILZ)) {
                C1634780sdw c1634780sdw = this.LLILLL;
                if (!(!c1634780sdw.LIZJ().LJI(c1634780sdw.LIZ).isEmpty())) {
                    C1634780sdw c1634780sdw2 = this.LLILLL;
                    C1635170seZ c1635170seZLIZ = C1635170seZ.LIZ(c1635170seZ, 0, null, true, null, this.LLILZ.getExtra(), null, 32191);
                    this.LL = c1635170seZ;
                    this.LLILLJJLI = 1;
                    if (c1634780sdw2.LIZLLL(c1635170seZLIZ, this) == objLJFF) {
                        C1C7U.LIZIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
                        return objLJFF;
                    }
                }
            }
        }
        if (C123100dR.LIZ(this.LLILZIL)) {
            ConcurrentHashMap<String, Object> concurrentHashMapLIZ = C178100mJ.LIZ(this.LLILZIL);
            if (concurrentHashMapLIZ != null) {
                Object obj2 = concurrentHashMapLIZ.get("cutout");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (Boolean.parseBoolean(str)) {
                    C1634780sdw c1634780sdw3 = this.LLILLL;
                    String str9 = c1634780sdw3.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Object obj3 = concurrentHashMapLIZ.get("path");
                    if (obj3 instanceof String) {
                        str2 = (String) obj3;
                    } else {
                        str2 = null;
                    }
                    Object obj4 = concurrentHashMapLIZ.get("path");
                    if ((obj4 instanceof String) && (str6 = (String) obj4) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("file://");
                        sbLIZ.append(str6);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = null;
                    }
                    Object obj5 = concurrentHashMapLIZ.get("stickerId");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    Object obj6 = concurrentHashMapLIZ.get("width");
                    if (obj6 instanceof String) {
                        str4 = (String) obj6;
                    } else {
                        str4 = null;
                    }
                    Object obj7 = concurrentHashMapLIZ.get("height");
                    if (obj7 instanceof String) {
                        str5 = (String) obj7;
                    } else {
                        str5 = null;
                    }
                    C1635170seZ c1635170seZ2 = new C1635170seZ(str9, jCurrentTimeMillis2, null, str2, strLIZIZ, null, str3, str4, str5, null, 25545);
                    this.LL = null;
                    this.LLILLJJLI = 2;
                    if (c1634780sdw3.LIZLLL(c1635170seZ2, this) == objLJFF) {
                        C1C7U.LIZIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
                        return objLJFF;
                    }
                }
            }
        } else {
            C1634780sdw c1634780sdw4 = this.LLILLL;
            this.LL = null;
            this.LLILLJJLI = 3;
            if (c1634780sdw4.LIZLLL(c1635170seZ, this) == objLJFF) {
                C1C7U.LIZIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProStickerPanelAdapterComponent@b373.processRecentUsedSticker$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
