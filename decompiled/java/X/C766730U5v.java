package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766730U5v implements C0U3X<RoomSticker> {
    @Override // X.C0U3X
    public final List<C0U74<RoomSticker>> LJI(EffectChannelResponse effectChannelResponse) {
        List<String> urlPrefix;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (effectChannelResponse != null && (urlPrefix = effectChannelResponse.getUrlPrefix()) != null) {
            List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
            if (categoryResponseList != null) {
                for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                    String key = effectCategoryResponse.getKey();
                    int iHashCode = key.hashCode();
                    if (iHashCode != 3556653) {
                        if (iHashCode != 96891546) {
                            if (iHashCode == 100313435 && key.equals("image")) {
                                for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                                    try {
                                        new p();
                                        arrayList.add(LIZ(p.LIZJ(effect.getExtra()).LJIILIIL(), urlPrefix, CastLongProtector.parseLong(effect.getEffectId()), effect.getName(), effect.getResourceId()));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        } else if (key.equals("event")) {
                            for (Effect effect2 : effectCategoryResponse.getTotalEffects()) {
                                try {
                                    C766720U5u c766720U5u = C766720U5u.LIZ;
                                    new p();
                                    n nVarLJIILIIL = p.LIZJ(effect2.getExtra()).LJIILIIL();
                                    long j = CastLongProtector.parseLong(effect2.getEffect_id());
                                    String name = effect2.getName();
                                    String resource_id = effect2.getResource_id();
                                    c766720U5u.getClass();
                                    RoomSticker roomStickerLIZ = C766720U5u.LIZ(nVarLJIILIIL, urlPrefix, j, name, resource_id);
                                    roomStickerLIZ.content = effect2.getHint();
                                    C189200o6.m2constructorimpl(Boolean.valueOf(arrayList3.add(roomStickerLIZ)));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                                }
                            }
                        }
                    } else if (key.equals("text")) {
                        for (Effect effect3 : effectCategoryResponse.getTotalEffects()) {
                            try {
                                new p();
                                RoomSticker roomStickerLIZIZ = LIZIZ(p.LIZJ(effect3.getExtra()).LJIILIIL(), urlPrefix, CastLongProtector.parseLong(effect3.getEffectId()), effect3.getName(), effect3.getResourceId());
                                roomStickerLIZIZ.content = effect3.getHint();
                                roomStickerLIZIZ.name = effect3.getName();
                                arrayList2.add(roomStickerLIZIZ);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            String str = C0UD4.LIZ;
            arrayList4.add(new C0U74("livestickerimage", "livestickerimage", null, null, null, arrayList, null, 248));
            arrayList4.add(new C0U74("livestickertext", "livestickertext", null, null, null, arrayList2, null, 248));
            arrayList4.add(new C0U74("livestickerevent", "livestickerevent", null, null, null, arrayList3, null, 248));
            return arrayList4;
        }
        return new ArrayList();
    }

    public static RoomSticker LIZ(n nVar, List list, long j, String str, String str2) {
        String strLJIL;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.id = j;
        roomSticker.LIZ = str2;
        roomSticker.name = str;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            strLJIL = null;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            k kVarLJJIIZ = nVar.LJJIIZ("image_uri");
            if (kVarLJJIIZ != null) {
                strLJIL = kVarLJJIIZ.LJIL();
            }
            sbLIZ.append(strLJIL);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        roomSticker.screenWidth = C497740JfY.LJIIZILJ();
        roomSticker.screenHeight = C497740JfY.LJIILLIIL();
        k kVarLJJIIZ2 = nVar.LJJIIZ("image_uri");
        if (kVarLJJIIZ2 != null) {
            strLJIL = kVarLJJIIZ2.LJIL();
        }
        roomSticker.image = new ImageModel(strLJIL, arrayList);
        roomSticker.type = 5;
        roomSticker.LIZ = str2;
        return roomSticker;
    }

    public static RoomSticker LIZIZ(n nVar, List list, long j, String str, String str2) {
        int iLJIIJJI;
        int iLJIIJJI2;
        int iLJIIJJI3;
        int iLJIIJJI4;
        String strLJIL;
        String strLJIL2;
        int iLJIIJJI5;
        String strLJIL3;
        String strLJIL4;
        String strLJIL5 = null;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.id = j;
        roomSticker.LIZ = str2;
        roomSticker.name = str;
        roomSticker.screenWidth = C497740JfY.LJIIZILJ();
        roomSticker.screenHeight = C497740JfY.LJIILLIIL();
        k kVarLJJIIZ = nVar.LJJIIZ("top_left_h");
        int iLJIIJJI6 = 0;
        if (kVarLJJIIZ != null) {
            iLJIIJJI = kVarLJJIIZ.LJIIJJI();
        } else {
            iLJIIJJI = 0;
        }
        roomSticker.topLeftHeight = iLJIIJJI;
        k kVarLJJIIZ2 = nVar.LJJIIZ("top_left_w");
        if (kVarLJJIIZ2 != null) {
            iLJIIJJI2 = kVarLJJIIZ2.LJIIJJI();
        } else {
            iLJIIJJI2 = 0;
        }
        roomSticker.topLeftWidth = iLJIIJJI2;
        k kVarLJJIIZ3 = nVar.LJJIIZ("bottom_right_h");
        if (kVarLJJIIZ3 != null) {
            iLJIIJJI3 = kVarLJJIIZ3.LJIIJJI();
        } else {
            iLJIIJJI3 = 0;
        }
        roomSticker.bottomRightHeight = iLJIIJJI3;
        k kVarLJJIIZ4 = nVar.LJJIIZ("bottom_right_w");
        if (kVarLJJIIZ4 != null) {
            iLJIIJJI4 = kVarLJJIIZ4.LJIIJJI();
        } else {
            iLJIIJJI4 = 0;
        }
        roomSticker.bottomRightWidth = iLJIIJJI4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            strLJIL = null;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            k kVarLJJIIZ5 = nVar.LJJIIZ("image_uri");
            if (kVarLJJIIZ5 != null) {
                strLJIL4 = kVarLJJIIZ5.LJIL();
            } else {
                strLJIL4 = null;
            }
            sbLIZ.append(strLJIL4);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            k kVarLJJIIZ6 = nVar.LJJIIZ("nine_patch_image_uri");
            if (kVarLJJIIZ6 != null) {
                strLJIL = kVarLJJIIZ6.LJIL();
            }
            sbLIZ2.append(strLJIL);
            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        k kVarLJJIIZ7 = nVar.LJJIIZ("image_uri");
        if (kVarLJJIIZ7 != null) {
            strLJIL5 = kVarLJJIIZ7.LJIL();
        }
        roomSticker.image = new ImageModel(strLJIL5, arrayList);
        k kVarLJJIIZ8 = nVar.LJJIIZ("nine_patch_image_uri");
        if (kVarLJJIIZ8 != null) {
            strLJIL = kVarLJJIIZ8.LJIL();
        }
        roomSticker.ninePatchImage = new ImageModel(strLJIL, arrayList2);
        k kVarLJJIIZ9 = nVar.LJJIIZ("text_size");
        if (kVarLJJIIZ9 != null) {
            iLJIIJJI6 = kVarLJJIIZ9.LJIIJJI();
        }
        roomSticker.textSize = iLJIIJJI6;
        k kVarLJJIIZ10 = nVar.LJJIIZ("text_color");
        String str4 = "";
        if (kVarLJJIIZ10 == null || (strLJIL2 = kVarLJJIIZ10.LJIL()) == null) {
            strLJIL2 = "";
        }
        roomSticker.textColor = strLJIL2;
        k kVarLJJIIZ11 = nVar.LJJIIZ("type");
        if (kVarLJJIIZ11 != null) {
            iLJIIJJI5 = kVarLJJIIZ11.LJIIJJI();
        } else {
            iLJIIJJI5 = 4;
        }
        roomSticker.type = iLJIIJJI5;
        k kVarLJJIIZ12 = nVar.LJJIIZ("content_key");
        if (kVarLJJIIZ12 != null && (strLJIL3 = kVarLJJIIZ12.LJIL()) != null) {
            str4 = strLJIL3;
        }
        roomSticker.contentKey = str4;
        roomSticker.LIZ = str2;
        return roomSticker;
    }
}
