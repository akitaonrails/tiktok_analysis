package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit.h;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit.MobileEffectGuideSubmitScene$onSheetDataChanged$1", f = "MobileEffectGuideSubmitScene.kt", l = {77, 78}, m = "invokeSuspend")
public final class C1419740n36 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C099G LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1419760n38 LLILZLL;
    public final /* synthetic */ h LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419740n36(C1419760n38 c1419760n38, h hVar, InterfaceC1364105Vn<? super C1419740n36> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1419760n38;
        this.LLIZ = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1419740n36 c1419740n36 = new C1419740n36(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1419740n36.LLILZIL = obj;
        return c1419740n36;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0n39] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final String str;
        final String str2;
        C099G c099gLIZIZ;
        boolean zBooleanValue;
        C1C7U.LIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zBooleanValue = this.LLILLL;
                    str2 = (String) this.LL;
                    str = (String) this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        ?? r7 = new Object(str, str2) { // from class: X.0n39
                        };
                        final h hVar = this.LLIZ;
                        final C1419760n38 c1419760n38 = this.LLILZLL;
                        Context contextRequireSceneContext = hVar.requireSceneContext();
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        c1390920mIc.LJIIIIZZ(1);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJLL = true;
                        tuxSheet.LLJLILLLLZIIL = false;
                        C1425370nCB c1425370nCB = new C1425370nCB(contextRequireSceneContext, null, 0);
                        c1425370nCB.LL = r7;
                        C1425370nCB.h0(c1425370nCB.LLILLJJLI, str);
                        C1425370nCB.h0(c1425370nCB.LLILLL, str2);
                        c1390920mIc.LIZ.LLJJIII = c1425370nCB;
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(395));
                        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                        tuxSheet2.LLJJL = iLIZIZ;
                        tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.0n37
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                String str3;
                                C1419780n3A c1419780n3A;
                                String str4 = TuxSheet._pnsPageId;
                                AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                                if (!(abstractC343940De4LJIIJ instanceof C1419780n3A) || (c1419780n3A = (C1419780n3A) abstractC343940De4LJIIJ) == null || (str3 = c1419780n3A.LIZ) == null) {
                                    str3 = "outside_dismiss";
                                }
                                String str5 = hVar.LLLLLJIL().shootWay;
                                String str6 = "";
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str7 = hVar.LLLLLJIL().enterFrom;
                                if (str7 != null) {
                                    str6 = str7;
                                }
                                String str8 = c1419760n38.LIZ;
                                C01GW c01gw = C342540Dbo.LIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("shoot_way", str5);
                                linkedHashMap.put("shoot_enter_from", str6);
                                linkedHashMap.put("prop_id", str8);
                                linkedHashMap.put("button_name", str3);
                                C1449260noi.LJ("click_effect_encourage_post_window", linkedHashMap);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("on cancel, ");
                                sbLIZ.append(dialogInterface);
                                sbLIZ.append(", ");
                                sbLIZ.append(str3);
                                C201955140j.LIZIZ("MobileEffectGuideSubmitScene", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        };
                        tuxSheet2.show(((C19EG) hVar.requireActivity()).getSupportFragmentManager(), "MobileEffectGuideSubmitScene");
                        String str3 = hVar.LLLLLJIL().shootWay;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str5 = hVar.LLLLLJIL().enterFrom;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        String str6 = c1419760n38.LIZ;
                        C01GW c01gw = C342540Dbo.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("shoot_way", str3);
                        linkedHashMap.put("shoot_enter_from", str4);
                        linkedHashMap.put("prop_id", str6);
                        C1449260noi.LJ("show_effect_encourage_post_window", linkedHashMap);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
                        return unit;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
                    return unit2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c099gLIZIZ = this.LLILLJJLI;
            str2 = (String) this.LL;
            str = (String) this.LLILZIL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
            str = this.LLILZLL.LIZIZ;
            if (C960203pA.LIZIZ(this.LLIZ.requireSceneContext())) {
                str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/encourage_post/guide_submit_back_dark.png";
            } else {
                str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/encourage_post/guide_submit_back_light.png";
            }
            C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C442240HVu(str, null), 3);
            c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C442230HVt(str2, null), 3);
            this.LLILZIL = str;
            this.LL = str2;
            this.LLILLJJLI = c099gLIZIZ;
            this.LLILZ = 1;
            obj = c099gLIZIZ2.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
                return objLJFF;
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        this.LLILZIL = str;
        this.LL = str2;
        this.LLILLJJLI = null;
        this.LLILLL = zBooleanValue;
        this.LLILZ = 2;
        obj = c099gLIZIZ.LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
            return objLJFF;
        }
        boolean zBooleanValue22 = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectGuideSubmitScene@e262.onSheetDataChanged$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
