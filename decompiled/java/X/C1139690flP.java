package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0flP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.RenderRequestHelper$startCompositionRender$1$1", f = "RenderRequestHelper.kt", l = {181}, m = "invokeSuspend")
public final class C1139690flP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1140120fm6<InterfaceC1138060fim>>, Object> {
    public int LL;
    public final /* synthetic */ C1136280ffu LLILLJJLI;
    public final /* synthetic */ GiftMessage LLILLL;
    public final /* synthetic */ AssetsModel LLILZ;
    public final /* synthetic */ C1135280feI LLILZIL;
    public final /* synthetic */ InterfaceC1139410fkx LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139690flP(AssetsModel assetsModel, C1136280ffu c1136280ffu, C1135280feI c1135280feI, GiftMessage giftMessage, InterfaceC1139410fkx interfaceC1139410fkx, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1136280ffu;
        this.LLILLL = giftMessage;
        this.LLILZ = assetsModel;
        this.LLILZIL = c1135280feI;
        this.LLILZLL = interfaceC1139410fkx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1139690flP(this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LLILLL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.0flQ] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("RenderRequestHelper@639c.startCompositionRender$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            DataChannel dataChannel = this.LLILLJJLI.LIZ.getDataChannel();
            final C1136280ffu c1136280ffu = this.LLILLJJLI;
            InterfaceC1136810fgl interfaceC1136810fgl = c1136280ffu.LIZ;
            GiftMessage giftMessage = this.LLILLL;
            AssetsModel assetsModel = this.LLILZ;
            C1135280feI c1135280feI = this.LLILZIL;
            boolean z = c1136280ffu.LIZJ;
            Room room = c1136280ffu.LIZIZ;
            C1138600fje c1138600fje = c1136280ffu.LJFF;
            C1139660flM c1139660flM = new C1139660flM(dataChannel, interfaceC1136810fgl, giftMessage, assetsModel, new C1139710flR(assetsModel, c1135280feI, z, room, interfaceC1136810fgl, c1138600fje) { // from class: X.0flQ
                @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
                public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
                    int i2;
                    Long lValueOf;
                    C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("gift_play");
                    if (c1300480jwkLIZIZ != null) {
                        c1300480jwkLIZIZ.stop();
                    }
                    C1138600fje c1138600fje2 = this.LIZLLL;
                    AssetsModel assetsModel2 = this.LJ;
                    if (assetsModel2 != null) {
                        i2 = assetsModel2.resourceType;
                    } else {
                        i2 = 0;
                    }
                    if (assetsModel2 != null) {
                        lValueOf = Long.valueOf(assetsModel2.id);
                    } else {
                        lValueOf = null;
                    }
                    C1137510fht.LIZIZ(i2, c1138600fje2, lValueOf, Long.valueOf(this.LJFF.LJIIL), "on stop", false);
                    this.LIZJ.onVideoFinished();
                    c1136280ffu.LJII = null;
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
                    int i2;
                    Long lValueOf;
                    C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("gift_play");
                    if (c1300480jwkLIZIZ != null) {
                        c1300480jwkLIZIZ.stop();
                    }
                    C1138600fje c1138600fje2 = this.LIZLLL;
                    AssetsModel assetsModel2 = this.LJ;
                    if (assetsModel2 != null) {
                        i2 = assetsModel2.resourceType;
                    } else {
                        i2 = 0;
                    }
                    if (assetsModel2 != null) {
                        lValueOf = Long.valueOf(assetsModel2.id);
                    } else {
                        lValueOf = null;
                    }
                    C1137510fht.LIZIZ(i2, c1138600fje2, lValueOf, Long.valueOf(this.LJFF.LJIIL), c1141050fnb.LIZIZ, false);
                    int i3 = c1141050fnb.LIZ;
                    if (i3 != -27 && i3 != -31) {
                        this.LIZJ.onShowVideoError(this.LJFF);
                    }
                    this.LIZJ.onVideoFinished();
                    c1136280ffu.LJII = null;
                }

                @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
                public final void LJIIIZ(EnumC1138990fkH enumC1138990fkH, C1138610fjf c1138610fjf) {
                    int i2;
                    Long lValueOf;
                    C0UOQ.LJ.remove("video_gift_id");
                    C1276840jKc.LIZ.getClass();
                    C1276840jKc.LJJJJ(0L);
                    C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("gift_play");
                    if (c1300480jwkLIZIZ != null) {
                        c1300480jwkLIZIZ.stop();
                    }
                    C1138600fje c1138600fje2 = this.LIZLLL;
                    AssetsModel assetsModel2 = this.LJ;
                    if (assetsModel2 != null) {
                        i2 = assetsModel2.resourceType;
                    } else {
                        i2 = 0;
                    }
                    if (assetsModel2 != null) {
                        lValueOf = Long.valueOf(assetsModel2.id);
                    } else {
                        lValueOf = null;
                    }
                    C1137510fht.LIZIZ(i2, c1138600fje2, lValueOf, Long.valueOf(this.LJFF.LJIIL), "", true);
                    this.LIZJ.onVideoFinished();
                    C1141930fp1.LIZ.incrementAndGet();
                    C1138600fje c1138600fje3 = this.LIZLLL;
                    if (c1138600fje3 != null && c1138600fje3.LIZLLL) {
                        LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
                        C1143330frH.LIZ(new AbstractC1143570frf() { // from class: X.0frb
                            {
                                EnumC1143440frS enumC1143440frS = EnumC1143440frS.SELF_EFFECT_PLAY_STATUS;
                            }
                        });
                    } else if (this.LIZ) {
                        LinkedList<AbstractC1143340frI> linkedList2 = C1143330frH.LIZ;
                        C1143330frH.LIZ(new AbstractC1143570frf() { // from class: X.0frZ
                            {
                                EnumC1143440frS enumC1143440frS = EnumC1143440frS.ANCHOR_EFFECT_PLAY_STATUS;
                            }
                        });
                    }
                    c1136280ffu.LJII = null;
                }
            }, c1136280ffu.LIZLLL, c1136280ffu.LJ, c1135280feI, c1138600fje);
            InterfaceC1139410fkx interfaceC1139410fkx = this.LLILZLL;
            if (interfaceC1139410fkx != null) {
                c1139660flM.LJIIJ.put(InterfaceC1139410fkx.class, interfaceC1139410fkx);
            }
            this.LL = 1;
            objLIZ = new C1140080fm2(new C1140090fm3(new InterfaceC1140450fmd<C1139660flM, C1139660flM>() { // from class: X.0flw
                @Override // X.InterfaceC1140450fmd
                public final String getTag() {
                    return "GiftRenderParamsGroupTask";
                }

                @Override // X.InterfaceC1140460fme
                public final Object LIZ(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C1140430fmb.LIZ();
                    return new C1140080fm2(new C1140100fm4(new InterfaceC1140450fmd<C1139660flM, C1139660flM>() { // from class: X.0fjb
                        @Override // X.InterfaceC1140450fmd
                        public final String getTag() {
                            return "CommonParamsTask";
                        }

                        @Override // X.InterfaceC1140460fme
                        public final Object LIZ(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn2) {
                            String str;
                            C1139660flM c1139660flM2 = (C1139660flM) obj3;
                            GiftMessage giftMessage2 = c1139660flM2.LIZLLL;
                            C1135280feI c1135280feI2 = c1139660flM2.LJIIIIZZ;
                            C0T6Z c0t6z = c1135280feI2.LJIIZILJ;
                            C1138600fje c1138600fje2 = c1139660flM2.LJIIIZ;
                            if (c1138600fje2 == null || (str = c1138600fje2.LIZJ) == null) {
                                str = "";
                            }
                            c0t6z.put("send_gift_scene", str);
                            c0t6z.put("gift_id", String.valueOf(c1135280feI2.LJIIL));
                            c0t6z.put("effect_id", String.valueOf(c1135280feI2.LJFF));
                            c0t6z.put("asset_id", String.valueOf(c1135280feI2.LJFF));
                            JSONArray jSONArrayLIZLLL = C1138350fjF.LIZLLL(giftMessage2);
                            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArrayLIZLLL.length());
                            ArrayList arrayList = new ArrayList();
                            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                            while (it2.LLILLL) {
                                String str2 = C1138350fjF.LIZ.get(Integer.valueOf(jSONArrayLIZLLL.optInt(it2.nextInt(), -1)));
                                if (str2 != null) {
                                    arrayList.add(str2);
                                }
                            }
                            c0t6z.put("user_type", arrayList.toString());
                            return new C1140300fmO(c1139660flM2);
                        }
                    }, new InterfaceC1140450fmd<C1139660flM, C1139660flM>() { // from class: X.0fjN
                        @Override // X.InterfaceC1140450fmd
                        public final String getTag() {
                            return "LynxGiftParamsTask";
                        }

                        @Override // X.InterfaceC1140460fme
                        public final Object LIZ(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn2) throws JSONException {
                            C1139660flM c1139660flM2 = (C1139660flM) obj3;
                            GiftMessage giftMessage2 = c1139660flM2.LIZLLL;
                            if (C500260Jjc.LJJIJIIJI(giftMessage2.lynxExtra)) {
                                try {
                                    C189200o6.m2constructorimpl(c1139660flM2.LJIILIIL.put("lynx_extra", new JSONArray(C2334609Cu.LIZ.LJIILLIIL(giftMessage2.lynxExtra, new TypeToken<ArrayList<LynxGiftExtra>>() { // from class: X.00Wy
                                    }.getType()))));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                            c1139660flM2.LJIILIIL.put("user_role", C1138350fjF.LIZLLL(giftMessage2));
                            C1118530fDH.LIZ = new WeakReference<>(c1139660flM2.LIZIZ);
                            c1139660flM2.LJIILIIL.put("shiny_card_first_sent", C1118530fDH.LIZJ(giftMessage2));
                            c1139660flM2.LJIILIIL.put("card_id", giftMessage2.giftVariantId);
                            c1139660flM2.LJIILIIL.put("unlock_token", giftMessage2.shinyCardUnlockToken);
                            c1139660flM2.LJIILIIL.put("gift_send_enter_from", C1118530fDH.LIZIZ(giftMessage2));
                            return new C1140300fmO(c1139660flM2);
                        }
                    }, null)).LIZ(obj2, interfaceC1364105Vn);
                }
            }, new InterfaceC1140450fmd<C1139660flM, InterfaceC1138060fim>() { // from class: X.0fly
                @Override // X.InterfaceC1140450fmd
                public final String getTag() {
                    return "SelectEngineGroupTask";
                }

                @Override // X.InterfaceC1140460fme
                public final Object LIZ(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    return new C1140080fm2(new C1140110fm5(new InterfaceC1140450fmd<C1139660flM, InterfaceC1138060fim>() { // from class: X.0flf
                        @Override // X.InterfaceC1140450fmd
                        public final String getTag() {
                            return "LynxGiftGroupTask";
                        }

                        @Override // X.InterfaceC1140460fme
                        public final Object LIZ(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn2) {
                            boolean z2;
                            C1139660flM c1139660flM2 = (C1139660flM) obj3;
                            AssetsModel assetsModel2 = c1139660flM2.LJ;
                            if (assetsModel2 != null && assetsModel2.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                return new C1140240fmI(null);
                            }
                            return new C1140080fm2(new C1140090fm3(new InterfaceC1140450fmd<C1139660flM, C1139660flM>() { // from class: X.0fmR
                                @Override // X.InterfaceC1140450fmd
                                public final String getTag() {
                                    return "PrepareLynxGiftResource";
                                }

                                @Override // X.InterfaceC1140460fme
                                public final Object LIZ(Object obj4, InterfaceC1364105Vn interfaceC1364105Vn3) {
                                    return new C1139930fln().LIZ((C1139660flM) obj4, interfaceC1364105Vn3);
                                }
                            }, new InterfaceC1140450fmd<C1139660flM, InterfaceC1138060fim>() { // from class: X.0flC
                                @Override // X.InterfaceC1140450fmd
                                public final String getTag() {
                                    return "LynxGiftStartRenderTask";
                                }

                                /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
                                /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
                                @Override // X.InterfaceC1140460fme
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object LIZ(java.lang.Object r18, X.InterfaceC1364105Vn r19) throws org.json.JSONException {
                                    /*
                                        Method dump skipped, instruction units count: 575
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1139560flC.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
                                }
                            }, null)).LIZ(c1139660flM2, interfaceC1364105Vn2);
                        }
                    }, new InterfaceC1140450fmd<C1139660flM, InterfaceC1138060fim>() { // from class: X.0fle
                        @Override // X.InterfaceC1140450fmd
                        public final String getTag() {
                            return "VideoGiftGroupTask";
                        }

                        @Override // X.InterfaceC1140460fme
                        public final Object LIZ(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn2) {
                            C1139660flM c1139660flM2 = (C1139660flM) obj3;
                            AssetsModel assetsModel2 = c1139660flM2.LJ;
                            boolean z2 = true;
                            if (assetsModel2 == null || (assetsModel2.resourceType != AssetsModel.RESOURCE_TYPE_MP4 && assetsModel2.downgradeResourceType != AssetsModel.RESOURCE_TYPE_MP4)) {
                                z2 = false;
                            }
                            if (!z2) {
                                return new C1140240fmI(null);
                            }
                            return new C1140080fm2(new C1140090fm3(new InterfaceC1140450fmd<C1139660flM, C1139660flM>() { // from class: X.0fmH
                                @Override // X.InterfaceC1140450fmd
                                public final String getTag() {
                                    return "PrepareVideoGiftResource";
                                }

                                @Override // X.InterfaceC1140460fme
                                public final Object LIZ(Object obj4, InterfaceC1364105Vn interfaceC1364105Vn3) {
                                    return new C1140080fm2(new C1140210fmF(new InterfaceC1140460fme[]{new C1139670flN(), new C1140420fma()}, null)).LIZ(obj4, interfaceC1364105Vn3);
                                }
                            }, new InterfaceC1140450fmd<C1139660flM, InterfaceC1138060fim>() { // from class: X.0flD
                                @Override // X.InterfaceC1140450fmd
                                public final String getTag() {
                                    return "VideoGiftStartRenderTask";
                                }

                                /* JADX WARN: Type inference incomplete: some casts might be missing */
                                @Override // X.InterfaceC1140460fme
                                public final Object LIZ(Object obj4, InterfaceC1364105Vn interfaceC1364105Vn3) {
                                    Long lLJFF;
                                    C1139660flM c1139660flM3 = (C1139660flM) obj4;
                                    C1140430fmb.LIZ();
                                    int i2 = c1139660flM3.LIZ;
                                    C1138600fje c1138600fje2 = c1139660flM3.LJIIIZ;
                                    if (c1138600fje2 != null) {
                                        lLJFF = C2286608xc.LJFF(c1138600fje2.LIZ);
                                    } else {
                                        lLJFF = null;
                                    }
                                    C1140550fmn c1140550fmnLIZ = C1139720flS.LIZ(i2, lLJFF, c1139660flM3.LJIIIIZZ.LJIIZILJ, c1139660flM3.LJIIJ);
                                    c1140550fmnLIZ.LIZ(new C1140860fnI("VideoGiftStartRenderTask", C1697810uHb.LJIIJJI(new C1138940fkC(c1139660flM3.LJ, c1139660flM3.LJIIIIZZ, c1139660flM3.LJIIIZ), c1139660flM3.LJFF)));
                                    ((C1140340fmS) c1140550fmnLIZ.LIZ).LJII.add((AbstractC1140160fmA) C1139630flJ.LIZ(c1139660flM3.LIZLLL, c1139660flM3.LJII, c1139660flM3.LJIIJJI, c1139660flM3.LJIIL, c1139660flM3.LJIIIIZZ.LJIIZILJ, 4).LIZ);
                                    C01GW c01gw = C1140890fnL.LIZ;
                                    InterfaceC1138060fim interfaceC1138060fimLIZ = C1140890fnL.LIZ((C1140340fmS) c1140550fmnLIZ.LIZ);
                                    if (interfaceC1138060fimLIZ == null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("VideoGiftStartRenderTask");
                                        sbLIZ.append(" CompositionCall is null");
                                        return new C1140190fmD(new C1140250fmJ(new C1141050fnb(-18, C2188811AlT.LIZIZ(sbLIZ), null)));
                                    }
                                    ((C1140830fnF) interfaceC1138060fimLIZ).start();
                                    C1140430fmb.LIZ();
                                    return new C1140300fmO(interfaceC1138060fimLIZ);
                                }
                            }, null)).LIZ(c1139660flM2, interfaceC1364105Vn2);
                        }
                    }, null)).LIZ(obj2, interfaceC1364105Vn);
                }
            }, null)).LIZ(c1139660flM, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("RenderRequestHelper@639c.startCompositionRender$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RenderRequestHelper@639c.startCompositionRender$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1140120fm6<InterfaceC1138060fim>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
