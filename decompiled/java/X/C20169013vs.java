package X;

import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.GeckoResourceParam;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20169013vs implements InterfaceC20171613wI {
    public final Map<Integer, InterfaceC20168913vr> LIZ = new LinkedHashMap();
    public EnumC20169713vz LIZIZ = EnumC20169713vz.PENDING;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(360));

    @Override // X.InterfaceC20171613wI
    public final boolean LIZ() {
        return this.LIZIZ == EnumC20169713vz.SUCCESS;
    }

    public final boolean LIZLLL(StoryCommonStickerModel storyCommonStickerModel) {
        Object c098200Yq;
        Object c098200Yq2;
        String id;
        this.LIZJ.getValue().getClass();
        String stickerJsonData = storyCommonStickerModel.getStickerJsonData();
        List<String> materialPaths = storyCommonStickerModel.getMaterialPaths();
        List<String> materialPathIds = storyCommonStickerModel.getMaterialPathIds();
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (StorySocialEventStickerData) C1227904rF.LIZIZ(stickerJsonData, StorySocialEventStickerData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List<SocialStickerResourceMetaData> resources = ((StorySocialEventStickerData) c098200Yq).getResources();
            int i = 0;
            int i2 = 0;
            for (String str : materialPathIds) {
                int i3 = i + 1;
                if (i >= 0) {
                    SocialStickerResourceMetaData socialStickerResourceMetaData = (SocialStickerResourceMetaData) C13LP.LJJJLZIJ(i2, resources);
                    if (socialStickerResourceMetaData != null) {
                        id = socialStickerResourceMetaData.getId();
                    } else {
                        id = null;
                    }
                    if (Intrinsics.LJFF(id, str)) {
                        socialStickerResourceMetaData.setLocalPath((String) C13LP.LJJJLZIJ(i, materialPaths));
                    }
                    i2++;
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq2 = C1227904rF.LJI(c098200Yq);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return false;
        }
        storyCommonStickerModel.setStickerJsonData(str2);
        return true;
    }

    public final InterfaceC20168913vr LIZJ(int i, Context context) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        if (((LinkedHashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
                            this.LIZ.put(Integer.valueOf(i), new InterfaceC20168913vr() { // from class: X.13vm
                                @Override // X.InterfaceC20168913vr
                                public final Object LIZ(SocialStickerResourceMetaData socialStickerResourceMetaData, String str, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
                                    boolean z;
                                    String localPath = socialStickerResourceMetaData.getLocalPath();
                                    if (localPath != null && localPath.length() != 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (!z && C2286708xd.LIZJ(localPath)) {
                                        return new C20170413w6(new C20168613vo(""), EnumC20169713vz.SUCCESS, 0L, null, null, true, false, 0, 220);
                                    }
                                    return new C20170413w6(new C20168613vo(""), EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(12), false, false, 0, 236);
                                }
                            });
                        }
                        return (InterfaceC20168913vr) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(i));
                    }
                } else {
                    if (((LinkedHashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
                        this.LIZ.put(Integer.valueOf(i), new InterfaceC20168913vr() { // from class: X.13wa
                            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(55));

                            @Override // X.InterfaceC20168913vr
                            public final Object LIZ(SocialStickerResourceMetaData socialStickerResourceMetaData, String str, InterfaceC1364105Vn<? super C20170413w6> interfaceC1364105Vn) {
                                C1533790q13 c1533790q13LIZIZ;
                                String strLIZLLL;
                                GeckoResourceParam geckoParam = socialStickerResourceMetaData.getGeckoParam();
                                if (geckoParam == null) {
                                    return new C20170413w6(new C20168613vo(""), EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(2), false, false, 0, 236);
                                }
                                String localPath = socialStickerResourceMetaData.getLocalPath();
                                if (localPath == null || localPath.length() == 0) {
                                    if (str != null && str.length() != 0) {
                                        C197009126d c197009126d = InterfaceC20168913vr.LIZ;
                                        String id = socialStickerResourceMetaData.getId();
                                        c197009126d.getClass();
                                        socialStickerResourceMetaData.setLocalPath(C197009126d.LIZ(str, id));
                                    } else {
                                        return new C20170413w6(new C20168613vo(""), EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(7), false, false, 0, 236);
                                    }
                                }
                                Forest forest = (Forest) this.LIZIZ.getValue();
                                RequestParams requestParams = new RequestParams(null, 1, null);
                                requestParams.channel = geckoParam.getChannel();
                                requestParams.bundle = geckoParam.getPath();
                                requestParams.waitGeckoUpdate = true;
                                requestParams.resourceScene = EnumC1533980q1M.OTHER;
                                requestParams.enableCDNCache = true;
                                requestParams.enableMemoryCache = true;
                                requestParams.enableRequestReuse = true;
                                C1533910q1F c1533910q1FCreateSyncRequest = forest.createSyncRequest("", requestParams);
                                if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && c1533790q13LIZIZ.LIZIZ && (strLIZLLL = c1533790q13LIZIZ.LIZLLL()) != null && strLIZLLL.length() != 0) {
                                    if (C2286708xd.LJFF(c1533790q13LIZIZ.LIZLLL(), socialStickerResourceMetaData.getLocalPath())) {
                                        return new C20170413w6(new C20168613vo(""), EnumC20169713vz.SUCCESS, 0L, null, null, false, false, 0, 252);
                                    }
                                    return new C20170413w6(new C20168613vo(""), EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(3), false, false, 0, 236);
                                }
                                return new C20170413w6(new C20168613vo(""), EnumC20169713vz.FAILED, 0L, null, C2286608xc.LJ(8), false, false, 0, 236);
                            }
                        });
                    }
                    return (InterfaceC20168913vr) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(i));
                }
            }
            if (((LinkedHashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
                this.LIZ.put(Integer.valueOf(i), new C20168213vk(context));
            }
            return (InterfaceC20168913vr) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(i));
        }
        if (((LinkedHashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
            this.LIZ.put(Integer.valueOf(i), new C20173913wf());
        }
        return (InterfaceC20168913vr) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(i));
    }

    public final Object LIZIZ(Context context, String str, StorySocialEventStickerData storySocialEventStickerData, InterfaceC497601wk interfaceC497601wk, Function1 function1, Function1 function12, C20171413wG c20171413wG) {
        C20170113w3 c20170113w3 = new C20170113w3(interfaceC497601wk);
        SocialStickerResourceMetaData socialStickerResourceMetaData = new SocialStickerResourceMetaData("", 2, null, null, storySocialEventStickerData.getMetaData().getStickerId(), null, null, null, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_download_");
        sbLIZ.append(storySocialEventStickerData.getMetaData().getStickerId());
        C20168613vo c20168613vo = new C20168613vo(C2188811AlT.LIZIZ(sbLIZ));
        c20170113w3.LIZIZ(new C20169913w1(c20168613vo, new C20168813vq(this, socialStickerResourceMetaData, context, str, storySocialEventStickerData, c20168613vo, null), 6));
        for (SocialStickerResourceMetaData socialStickerResourceMetaData2 : storySocialEventStickerData.getResources()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("res_download_");
            sbLIZ2.append(socialStickerResourceMetaData2.getId());
            C20168613vo c20168613vo2 = new C20168613vo(C2188811AlT.LIZIZ(sbLIZ2));
            c20170113w3.LIZIZ(new C20169913w1(c20168613vo2, new C20168713vp(this, socialStickerResourceMetaData2, context, str, c20168613vo, c20168613vo2, null), 6));
        }
        Object objLIZJ = c20170113w3.LIZJ(storySocialEventStickerData, new AwS609S0100000_30(function1, (Function1<? super EffectPlatformBuilder, Unit>) 349), new AwS609S0100000_30(function12, (Function1<? super EffectPlatformBuilder, Unit>) 350), new AwS609S0100000_30(this, 351), c20171413wG);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }
}
