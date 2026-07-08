package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostLivingNoticeCapsuleNewInteractionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleDisposeTimingOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleMsgMaxDisplayNameLenSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleViewerEnabledSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112330f3H extends AbstractC1110800f0o<CapsuleMessage> implements InterfaceC1113740f5Y {
    public static final int LJJIZ = LiveCapsuleMsgMaxDisplayNameLenSetting.INSTANCE.getMaxDisplayNameLen();
    public final Integer LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final Function0<Unit> LJJIII;
    public boolean LJJIIJ;
    public C0KQ1 LJJIIJZLJL;
    public boolean LJJIIZ;
    public Boolean LJJIIZI;
    public Boolean LJJIJ;
    public Integer LJJIJIIJI;
    public LiveCapsuleStyleItemConfig LJJIJIIJIL;
    public Boolean LJJIJIL;
    public C1112380f3M LJJIJL;
    public int LJJIJLIJ;
    public boolean LJJIL;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return null;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final boolean LIZ() {
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 == null) {
            return true;
        }
        for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
            if (interfaceC1112400f3O != null && !interfaceC1112400f3O.LIZ()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        Integer num = this.LJJI;
        return num != null ? num.intValue() : R.drawable.eu1;
    }

    @Override // X.InterfaceC1113740f5Y
    public final C1112340f3I LJ() {
        return new C1112340f3I(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // X.InterfaceC1113740f5Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig LJI() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig r0 = r4.LJJIJIIJIL
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.bytedance.android.live.publicscreen.api.IPublicScreenService> r0 = com.bytedance.android.live.publicscreen.api.IPublicScreenService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.publicscreen.api.IPublicScreenService r1 = (com.bytedance.android.live.publicscreen.api.IPublicScreenService) r1
            MESSAGE extends X.0ffY r0 = r4.LJIL
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            int r0 = r0.capsuleType
            java.util.List r0 = r1.Z51(r0)
            if (r0 == 0) goto L42
            java.util.Iterator r3 = r0.iterator()
        L1d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0f3O r0 = (X.InterfaceC1112400f3O) r0
            if (r0 == 0) goto L1d
            boolean r1 = r0.LJIIIIZZ(r4)
            r0 = 1
            if (r1 != r0) goto L1d
        L33:
            X.0f3O r2 = (X.InterfaceC1112400f3O) r2
            if (r2 == 0) goto L42
            com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig r0 = r2.LJI()
            if (r0 == 0) goto L42
        L3d:
            r4.LJJIJIIJIL = r0
            return r0
        L40:
            r2 = 0
            goto L33
        L42:
            com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfigSetting r0 = com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfigSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfig r0 = r0.getValue()
            com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig r0 = r0.capsuleStyleItemConfig
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1112330f3H.LJI():com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig");
    }

    @Override // X.InterfaceC1113740f5Y
    public final int LJIJJ() {
        InterfaceC1112400f3O next;
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 != null) {
            Iterator<InterfaceC1112400f3O> it2 = listZ51.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                InterfaceC1112400f3O interfaceC1112400f3O = next;
                if (interfaceC1112400f3O != null && interfaceC1112400f3O.LJJIJL((CapsuleMessage) this.LJIL) != -1) {
                    break;
                }
            }
            InterfaceC1112400f3O interfaceC1112400f3O2 = next;
            if (interfaceC1112400f3O2 != null) {
                return interfaceC1112400f3O2.LJJIJL((CapsuleMessage) this.LJIL);
            }
        }
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC1113740f5Y
    public final boolean LJJIZ() {
        return MultiCoHostLivingNoticeCapsuleNewInteractionSetting.INSTANCE.isEnable() && (Intrinsics.LJFF(((CapsuleMessage) this.LJIL).scene, "friend-guide") || Intrinsics.LJFF(((CapsuleMessage) this.LJIL).scene, "friend-guide-no-frequency-control"));
    }

    @Override // X.InterfaceC1113740f5Y
    public final C244000ww LJJJJLL() {
        return new C244000ww(this);
    }

    @Override // X.InterfaceC1113740f5Y
    public final int LJJLL() {
        InterfaceC1112400f3O next;
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 != null) {
            Iterator<InterfaceC1112400f3O> it2 = listZ51.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                InterfaceC1112400f3O interfaceC1112400f3O = next;
                if (interfaceC1112400f3O != null && interfaceC1112400f3O.LJJIIZI((CapsuleMessage) this.LJIL) != -1) {
                    break;
                }
            }
            InterfaceC1112400f3O interfaceC1112400f3O2 = next;
            if (interfaceC1112400f3O2 != null) {
                return interfaceC1112400f3O2.LJJIIZI((CapsuleMessage) this.LJIL);
            }
        }
        return this.LJJII;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final ImageModel LJLLLLLL() {
        return ((CapsuleMessage) this.LJIL).icon;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLFII() {
        Integer num;
        Integer num2 = this.LJJIJIIJI;
        if (num2 != null) {
            return num2.intValue();
        }
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 == null || listZ51.isEmpty()) {
            num = 0;
        } else {
            for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                if (interfaceC1112400f3O != null && interfaceC1112400f3O.LJIIZILJ() == 1) {
                    num = 1;
                    break;
                }
            }
            num = 0;
        }
        this.LJJIJIIJI = num;
        return num.intValue();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final Text LLFZ() {
        return ((CapsuleMessage) this.LJIL).desc;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((CapsuleMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILZIL() {
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 != null) {
            for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                if (interfaceC1112400f3O != null) {
                    interfaceC1112400f3O.LJIILLIIL();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    @Override // X.AbstractC1110790f0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LLIZLLLIL() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1112330f3H.LLIZLLLIL():java.lang.CharSequence");
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJI() {
        Boolean bool = this.LJJIJIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 != null && !listZ51.isEmpty()) {
            for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                if (interfaceC1112400f3O != null) {
                    interfaceC1112400f3O.LJJIJIIJI();
                }
            }
        }
        Boolean bool2 = false;
        this.LJJIJIL = bool2;
        return bool2.booleanValue();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        return ((CapsuleMessage) this.LJIL).desc != null;
    }

    @Override // X.InterfaceC1113740f5Y
    public final CharSequence getActionText() {
        return C154600iW.LIZ(((CapsuleMessage) this.LJIL).buttonText, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJ() {
        /*
            r2 = this;
            X.0ez9 r0 = r2.LLIIIILZ()
            if (r0 == 0) goto L10
            boolean r1 = r0.LJI
            r0 = 1
            if (r1 != r0) goto L10
        Lb:
            boolean r0 = r2.LLJLILLLLZIIL(r0)
            return r0
        L10:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1112330f3H.LJJ():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1114100f68 LJLL() {
        /*
            r2 = this;
            X.0ez9 r0 = r2.LLIIIILZ()
            if (r0 == 0) goto L1f
            boolean r1 = r0.LJI
            r0 = 1
            if (r1 != r0) goto L1f
        Lb:
            boolean r0 = r2.LLJLILLLLZIIL(r0)
            if (r0 == 0) goto L1c
            X.0f3M r0 = r2.LJJIJL
            if (r0 != 0) goto L1c
            X.0f3M r0 = new X.0f3M
            r0.<init>(r2)
            r2.LJJIJL = r0
        L1c:
            X.0f3M r0 = r2.LJJIJL
            return r0
        L1f:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1112330f3H.LJLL():X.0f68");
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void dispose() {
        super.dispose();
        if (LiveCapsuleDisposeTimingOptimizeSetting.INSTANCE.getValue()) {
            return;
        }
        C1112360f3K c1112360f3K = C1112360f3K.LIZ;
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        CapsuleMessage capsuleMessage = (CapsuleMessage) this.LJIL;
        C0KAJ c0kaj = C0KAJ.AUTO_TERMINATE;
        c1112360f3K.getClass();
        C1112360f3K.LIZIZ(dataChannel, capsuleMessage, c0kaj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        super.onAttach();
        boolean z = !this.LJJIL;
        this.LJJIL = true;
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (!this.LJJIIJ) {
            this.LJJIIJ = true;
            if (listZ51 != null) {
                for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                    if (interfaceC1112400f3O != null) {
                        interfaceC1112400f3O.LJIL(this);
                    }
                }
            }
            if (((CapsuleMessage) this.LJIL).reportAction) {
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                C1102420enI.LIZIZ(4, false, false, LLIIIILZ().LJI ? "in_room" : "watch", ((CapsuleMessage) this.LJIL).scene, LLIIIILZ().LJIIZILJ);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (listZ51 != null) {
            for (InterfaceC1112400f3O interfaceC1112400f3O2 : listZ51) {
                if (interfaceC1112400f3O2 != null) {
                    interfaceC1112400f3O2.LJJIIJ(this);
                    interfaceC1112400f3O2.LJII(this, linkedHashMap);
                }
            }
        }
        CapsuleMessage capsuleMessage = (CapsuleMessage) this.LJIL;
        if (capsuleMessage.capsuleType == 3) {
            Text text = capsuleMessage.desc;
            linkedHashMap.put("starling_key", String.valueOf(text != null ? text.key : null));
        }
        if (((CapsuleMessage) this.LJIL).capsuleType == 61) {
            linkedHashMap.put("type", "autosuggest_onboarding");
        }
        MESSAGE message = this.LJIL;
        LLIIIILZ();
        C1091120eV4.LIZJ(message);
        C1112360f3K c1112360f3K = C1112360f3K.LIZ;
        C1109770ez9 c1109770ez9LLIIIILZ = LLIIIILZ();
        Object obj = this.LJIL;
        c1112360f3K.getClass();
        DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
        if (dataChannel != null) {
            Map<DataChannel, List<CapsuleMessage>> map2 = C1112360f3K.LIZJ;
            List arrayList = (List) ((LinkedHashMap) map2).get(dataChannel);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(dataChannel, (List<CapsuleMessage>) arrayList);
            }
            arrayList.add(obj);
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1112250f39 c1112250f39 = C1112250f39.LL;
            Map map3 = (Map) ((LinkedHashMap) C1112360f3K.LIZIZ).get(dataChannel);
            c1102070emj.LJIIJ(dataChannel, c1112250f39, map3 != null ? (C245300x9) map3.get(obj) : null, null);
        }
        if (z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_capsule_show");
            c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
            c474500IjALIZ.LJJII(LLJJJ(), "admin_type");
            c474500IjALIZ.LJJII(Long.valueOf(this.LJIL.getMessageId()), "msg_id");
            c474500IjALIZ.LJJII(((CapsuleMessage) this.LJIL).scene, "msg_name");
            c474500IjALIZ.LJJII(Integer.valueOf(((CapsuleMessage) this.LJIL).capsuleType), "msg_type");
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final int LJJIJ() {
        return LJJIZ;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void LJJJJL(boolean z) {
        C245300x9 c245300x9;
        super.LJJJJL(z);
        this.LJJIL = false;
        C1112360f3K c1112360f3K = C1112360f3K.LIZ;
        C1109770ez9 c1109770ez9LLIIIILZ = LLIIIILZ();
        Object obj = this.LJIL;
        c1112360f3K.getClass();
        DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
        if (dataChannel != null) {
            List list = (List) ((LinkedHashMap) C1112360f3K.LIZJ).get(dataChannel);
            if (list != null) {
                list.remove(obj);
            }
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1112250f39 c1112250f39 = C1112250f39.LL;
            Map map = (Map) ((LinkedHashMap) C1112360f3K.LIZIZ).get(dataChannel);
            if (map != null) {
                c245300x9 = (C245300x9) map.get(obj);
            } else {
                c245300x9 = null;
            }
            c1102070emj.getClass();
            C1102070emj.LJIILLIIL(dataChannel, c1112250f39, c245300x9);
        }
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
        ImageModel imageModelLJLLLLLL = LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324570kZb.LJIIIIZZ(imageModelLJLLLLLL);
        }
        C1112360f3K c1112360f3K = C1112360f3K.LIZ;
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        CapsuleMessage capsuleMessage = (CapsuleMessage) this.LJIL;
        c1112360f3K.getClass();
        C1112360f3K.LIZ(dataChannel, capsuleMessage, null);
    }

    public final CharSequence LLJLIL(int i) {
        if (i != Integer.MAX_VALUE) {
            LLJJIJI(null);
            C1112380f3M c1112380f3M = this.LJJIJL;
            if (c1112380f3M != null) {
                c1112380f3M.LIZ = i;
            }
        }
        CharSequence content = getContent();
        if (content == null) {
            return "";
        }
        return content;
    }

    public final boolean LLJLILLLLZIIL(boolean z) {
        Boolean boolValueOf;
        Boolean bool = this.LJJIJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = false;
        if (!z && !LiveCapsuleStyleViewerEnabledSetting.INSTANCE.getValue()) {
            this.LJJIJ = Boolean.FALSE;
            return false;
        }
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LJIL).capsuleType);
        if (listZ51 != null) {
            if (!listZ51.isEmpty()) {
                Iterator<InterfaceC1112400f3O> it2 = listZ51.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1112400f3O next = it2.next();
                    if (next != null && next.LJIIIIZZ(this)) {
                        z2 = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            if (LiveCapsuleStyleSetting.INSTANCE.getValue() > 0) {
                z2 = true;
            }
            boolValueOf = Boolean.valueOf(z2);
        }
        this.LJJIJ = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public C1112330f3H(CapsuleMessage capsuleMessage, Integer num, int i, int i2, Function0 function0) {
        super(capsuleMessage);
        this.LJJI = num;
        this.LJJIFFI = i;
        this.LJJII = i2;
        this.LJJIII = function0;
    }

    public /* synthetic */ C1112330f3H(CapsuleMessage capsuleMessage, Integer num, Integer num2, int i, int i2, Function0 function0, int i3) {
        this(capsuleMessage, (i3 & 2) != 0 ? null : num, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) == 0 ? function0 : null);
    }
}
