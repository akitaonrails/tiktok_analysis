package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0YeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879320YeY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, C0Y8T c0y8t, InterfaceC879330YeZ interfaceC879330YeZ) {
        if (interfaceC879330YeZ instanceof C459160HzW) {
            String str3 = ((C459160HzW) interfaceC879330YeZ).LIZ;
            C1917907fF c1917907fF = (C1917907fF) ((AbstractC2202061BGi) C452590Hov.LIZ.getValue()).getUserScopeObject();
            if (c1917907fF != null && str3.length() != 0) {
                ArrayList arrayList = new ArrayList(c1917907fF.LIZ());
                arrayList.remove(str3);
                ListProtector.add(arrayList, 0, str3);
                ((Keva) c1917907fF.LIZ.getValue()).storeString("emoji_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            }
        } else if (interfaceC879330YeZ instanceof C455420HtU) {
            IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLIIIJJI(((C455420HtU) interfaceC879330YeZ).LIZIZ, c0y8t.getConversationId());
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C879310YeX(str, interfaceC879330YeZ, c0y8t, str2, null), 3);
    }

    public static void LIZ(C869590Y9l c869590Y9l, String str, C0Y8T c0y8t, InterfaceC879330YeZ interfaceC879330YeZ, C914090ZtX c914090ZtX) {
        Long lValueOf;
        if (interfaceC879330YeZ instanceof C879290YeV) {
            return;
        }
        C0YAK c0yak = new C0YAK();
        c0yak.LIZIZ(c0y8t);
        if (c869590Y9l != null) {
            c0yak.LIZ.serverMessageId = c869590Y9l.getMsgId();
            c0yak.LIZ.clientMessageId = c869590Y9l.getUuid();
        }
        c0yak.LIZ(C0YS6.REMOVE_PROPERTY_ITEM, interfaceC879330YeZ.LIZ(), str, C0YAP.fromValue(interfaceC879330YeZ.LIZJ()), null, null);
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILL(new C0Y3I("delete message reactions"), c0yak.LIZ, c914090ZtX);
        IIMUserPortraitManager.LIZ.getClass();
        IIMUserPortraitManager iIMUserPortraitManagerLIZ = C0Z5R.LIZ();
        if (iIMUserPortraitManagerLIZ != null) {
            iIMUserPortraitManagerLIZ.LJII("like_message_local_label", "1");
        }
        IIMUserPortraitManager iIMUserPortraitManagerLIZ2 = C0Z5R.LIZ();
        if (iIMUserPortraitManagerLIZ2 != null) {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                lValueOf = Long.valueOf(iMHostApiLIZ.LIZIZ());
            } else {
                lValueOf = null;
            }
            iIMUserPortraitManagerLIZ2.LJII("like_message_local_time_stamp", String.valueOf(lValueOf));
        }
    }
}
