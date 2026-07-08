package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestOptGetSettingsSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0bEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965320bEA extends C09AY implements Function0<InterfaceC964790bDJ> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965320bEA(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.0aVw, X.0bDJ] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC964790bDJ invoke() {
        C965220bE0 c965220bE0;
        C2181461AZc c2181461AZc;
        LinkMicLayoutLayer linkMicLayoutLayer;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        Room room = this.LL.LIZLLL;
        if (C781520UlC.LJFF(room) && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optAbParams && MultiGuestOptGetSettingsSetting.INSTANCE.isEnable() && (multiLiveUserSettings = room.multiLiveUserSettings) != null && multiLiveUserSettings.isRoomPackSucAbSettings()) {
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            String str = (multiLiveUserSettings2 == null || (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) == null || (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) == null) ? null : roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(room.getId());
            sbLIZ.append(", ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(C931820aM8.LIZIZ);
            C20441214yg.LIZIZ("VoiceChatLayoutSettingsHelper", C2188811AlT.LIZIZ(sbLIZ));
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            C931820aM8.LJI(str, idStr);
        }
        C965340bEC c965340bEC = this.LL;
        Context context = c965340bEC.LIZ;
        int i = c965340bEC.LIZIZ;
        long id = c965340bEC.LIZLLL.getId();
        String strLIZ = C354201Zc.LIZ(this.LL.LIZLLL.getStreamType());
        long id2 = this.LL.LIZLLL.getOwner().getId();
        C968900bJw c968900bJwLLJLL = this.LL.LLJLL();
        EnumC945310aht enumC945310aht = EnumC945310aht.LIVE_ROOM;
        boolean z = this.LL.LJ;
        Drawable drawable = C949650aot.LIZ() ? this.LL.LIZ.getDrawable(R.drawable.f1m) : new ColorDrawable(-15263977);
        if (this.LL.LJ || C931790aM5.LIZIZ() || C931780aM4.LJ(this.LL.LIZLLL)) {
            c965220bE0 = null;
        } else {
            c965220bE0 = (C965220bE0) this.LL.LJIJ.getValue();
            C964760bDG c964760bDG = this.LL.LJIJI;
            if (!c964760bDG.LJII.contains(c965220bE0)) {
                c964760bDG.LJII.add(c965220bE0);
            }
        }
        C2177031AIb c2177031AIb = new C2177031AIb(context, i, id, strLIZ, id2, c968900bJwLLJLL, false, enumC945310aht, z, drawable, c965220bE0);
        C965340bEC c965340bEC2 = this.LL;
        if (c965340bEC2.LIZIZ == 4 && C931780aM4.LJ(c965340bEC2.LIZLLL)) {
            C965340bEC c965340bEC3 = this.LL;
            C1AZW.LIZIZ(c965340bEC3.LJJII, c965340bEC3.LJIIIIZZ, "use new layout layer sdk for voice", null, null);
            return new C2181461AZc(c2177031AIb, this.LL.LJIIZILJ);
        }
        if (this.LL.LIZIZ != 4 || !C931790aM5.LIZIZ()) {
            C965340bEC c965340bEC4 = this.LL;
            if (c965340bEC4.LIZIZ != 2 || !C783530UoR.LIZ(c965340bEC4.LJ)) {
                C965340bEC c965340bEC5 = this.LL;
                if (c965340bEC5.LIZIZ != 0) {
                    C965350bED c965350bED = c965340bEC5.LJJII;
                    String str2 = c965340bEC5.LJIIIIZZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("use old layout layer sdk, scene=");
                    sbLIZ2.append(this.LL.LIZIZ);
                    sbLIZ2.append(", enable1:");
                    sbLIZ2.append(C931790aM5.LIZIZ());
                    sbLIZ2.append(", enable2:");
                    sbLIZ2.append(C783530UoR.LIZ(this.LL.LJ));
                    C1AZW.LJI(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    final C1AXM c1axm = new C1AXM(c2177031AIb);
                    C965340bEC c965340bEC6 = this.LL;
                    c965340bEC6.LJIILL.LJJJ(c965340bEC6.LIZIZ, c965340bEC6.LIZJ, new InterfaceC1303110k0z() { // from class: X.0bEB
                        @Override // X.InterfaceC1303110k0z
                        public final void LIZ(DslLayout dslLayout) {
                            c1axm.LJJIIJZLJL(dslLayout);
                        }
                    }, null);
                    return c1axm;
                }
            }
        }
        C965340bEC c965340bEC7 = this.LL;
        C1AZW.LIZIZ(c965340bEC7.LJJII, c965340bEC7.LJIIIIZZ, "use new layout layer sdk", null, null);
        if (!LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            return new C2181461AZc(c2177031AIb, this.LL.LJIIZILJ);
        }
        String str3 = this.LL.LJIIIIZZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("use external layout manager, externalLayoutManager is null: ");
        sbLIZ3.append(this.LL.LJII == null);
        C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
        C965340bEC c965340bEC8 = this.LL;
        InterfaceC937900aVw interfaceC937900aVw = c965340bEC8.LJII;
        if ((interfaceC937900aVw instanceof C2181461AZc) && (c2181461AZc = (C2181461AZc) interfaceC937900aVw) != null) {
            C2181391AYv c2181391AYv = c965340bEC8.LJIIZILJ;
            c2181461AZc.LL = c2177031AIb;
            c2181461AZc.LLILLJJLI = c2181391AYv;
            if (c2181391AYv != null && (linkMicLayoutLayer = c2181461AZc.LLJJJJ) != null) {
                linkMicLayoutLayer.LJIIZILJ(c2181391AYv);
            }
        }
        ?? r6 = this.LL.LJII;
        return (!(r6 instanceof C2181461AZc) || r6 == 0) ? new C2181461AZc(c2177031AIb, this.LL.LJIIZILJ) : r6;
    }
}
