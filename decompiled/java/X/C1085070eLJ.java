package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeCapsuleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubSuperFanEmoteCapsuleSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085070eLJ {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0eLI
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v30, types: [T, com.bytedance.android.livesdk.model.message.common.Text] */
        /* JADX WARN: Type inference failed for: r2v31, types: [T, com.bytedance.android.livesdk.model.message.common.Text] */
        /* JADX WARN: Type inference failed for: r4v8, types: [T, com.bytedance.android.livesdk.model.message.common.Text] */
        /* JADX WARN: Type inference failed for: r4v9, types: [T, com.bytedance.android.livesdk.model.message.common.Text] */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C07Z5 c07z5;
            Text text;
            Text text2;
            FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey;
            FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey2;
            C07Z5 c07z52;
            C07Z5 c07z53;
            FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey;
            FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey2;
            int i = message.what;
            long j = 0;
            String str = null;
            if (i != 9) {
                if (i != 10) {
                    if (i == 13) {
                        BPEAHandler bPEAHandler = C1085070eLJ.LIZ;
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if (messageObj instanceof C07Z5) {
                            c07z53 = (C07Z5) messageObj;
                        } else {
                            c07z53 = null;
                        }
                        C259800zU c259800zU = new C259800zU();
                        ?? text3 = new Text();
                        text3.defaultPattern = "";
                        c259800zU.element = text3;
                        C259800zU c259800zU2 = new C259800zU();
                        ?? text4 = new Text();
                        text4.defaultPattern = "";
                        c259800zU2.element = text4;
                        FansClubSuperFanEmoteCapsuleSetting fansClubSuperFanEmoteCapsuleSetting = FansClubSuperFanEmoteCapsuleSetting.INSTANCE;
                        FansClubSuperFanEmoteCapsuleSetting.LiveSuperFansEmoteCapsuleConfig value = fansClubSuperFanEmoteCapsuleSetting.getValue();
                        if (value != null && (liveSuperFanEmoteStarlingKey2 = value.buttonText) != null) {
                            ?? text5 = new Text();
                            text5.key = liveSuperFanEmoteStarlingKey2.key;
                            text5.defaultPattern = liveSuperFanEmoteStarlingKey2.pattern;
                            c259800zU2.element = text5;
                        }
                        FansClubSuperFanEmoteCapsuleSetting.LiveSuperFansEmoteCapsuleConfig value2 = fansClubSuperFanEmoteCapsuleSetting.getValue();
                        if (value2 != null && (liveSuperFanEmoteStarlingKey = value2.content) != null) {
                            ?? text6 = new Text();
                            text6.key = liveSuperFanEmoteStarlingKey.key;
                            text6.defaultPattern = liveSuperFanEmoteStarlingKey.pattern;
                            c259800zU.element = text6;
                        }
                        CapsuleMessage capsuleMessage = new CapsuleMessage();
                        capsuleMessage.capsuleType = 70;
                        capsuleMessage.desc = (Text) c259800zU.element;
                        capsuleMessage.buttonText = (Text) c259800zU2.element;
                        if (c07z53 != null) {
                            str = c07z53.LIZIZ;
                        }
                        capsuleMessage.schema = str;
                        capsuleMessage.scene = "super_fan_emotes_upload";
                        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                        if (c07z53 != null) {
                            j = c07z53.LIZ;
                        }
                        iPublicScreenService.XK(j, new C1112330f3H(capsuleMessage, null, null, R.attr.duz, R.attr.cdi, null, 38));
                        InterfaceC1106030et7.V8.LIZJ(String.valueOf(C1085070eLJ.LIZIZ() + 1));
                    }
                    return true;
                }
                BPEAHandler bPEAHandler2 = C1085070eLJ.LIZ;
                Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                if (messageObj2 instanceof C07Z5) {
                    c07z52 = (C07Z5) messageObj2;
                } else {
                    c07z52 = null;
                }
                CapsuleMessage capsuleMessage2 = new CapsuleMessage();
                capsuleMessage2.capsuleType = 70;
                Text text7 = new Text();
                text7.key = "ttlive_superFan_viewer_commentNotif_introduceSuperFan_text";
                text7.defaultPattern = "Introducing Super Fan! Learn what it is and how to set it ";
                capsuleMessage2.desc = text7;
                Text text8 = new Text();
                text8.key = "ttlive_superFan_viewer_commentNotif_introduceSuperFan_btn";
                text8.defaultPattern = "Go";
                capsuleMessage2.buttonText = text8;
                if (c07z52 != null) {
                    str = c07z52.LIZIZ;
                }
                capsuleMessage2.schema = str;
                capsuleMessage2.scene = "superfan_upgrade";
                IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                if (c07z52 != null) {
                    j = c07z52.LIZ;
                }
                iPublicScreenService2.XK(j, new C1112330f3H(capsuleMessage2, null, null, R.attr.duz, R.attr.cdi, null, 38));
                InterfaceC1106030et7.U8.LIZJ(String.valueOf(C1085070eLJ.LIZ() + 1));
                return true;
            }
            BPEAHandler bPEAHandler3 = C1085070eLJ.LIZ;
            Object messageObj3 = HandlerHook.getMessageObj(message.obj);
            if (messageObj3 instanceof C07Z5) {
                c07z5 = (C07Z5) messageObj3;
            } else {
                c07z5 = null;
            }
            CapsuleMessage capsuleMessage3 = new CapsuleMessage();
            capsuleMessage3.capsuleType = 70;
            FansClubCustomizeCapsuleSetting fansClubCustomizeCapsuleSetting = FansClubCustomizeCapsuleSetting.INSTANCE;
            FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig value3 = fansClubCustomizeCapsuleSetting.getValue();
            if (value3 != null && (liveFansCapsuleStarlingKey2 = value3.content) != null) {
                text = new Text();
                text.key = liveFansCapsuleStarlingKey2.key;
                text.defaultPattern = liveFansCapsuleStarlingKey2.pattern;
            } else {
                text = new Text();
                text.defaultPattern = "";
            }
            capsuleMessage3.desc = text;
            FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig value4 = fansClubCustomizeCapsuleSetting.getValue();
            if (value4 != null && (liveFansCapsuleStarlingKey = value4.buttonText) != null) {
                text2 = new Text();
                text2.key = liveFansCapsuleStarlingKey.key;
                text2.defaultPattern = liveFansCapsuleStarlingKey.pattern;
            } else {
                text2 = new Text();
                text2.defaultPattern = "";
            }
            capsuleMessage3.buttonText = text2;
            if (c07z5 != null) {
                str = c07z5.LIZIZ;
            }
            capsuleMessage3.schema = str;
            capsuleMessage3.scene = "set_up_badge_and_sticker";
            IPublicScreenService iPublicScreenService3 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            if (c07z5 != null) {
                j = c07z5.LIZ;
            }
            iPublicScreenService3.XK(j, new C1112330f3H(capsuleMessage3, null, null, R.attr.duz, R.attr.cdi, null, 38));
            return true;
        }
    });

    public static int LIZ() {
        String strLIZ = InterfaceC1106030et7.U8.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        try {
            if (C504670Jqj.LIZIZ(strLIZ)) {
                return 0;
            }
            return CastIntegerProtector.parseInt(strLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static int LIZIZ() {
        String strLIZ = InterfaceC1106030et7.V8.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        try {
            if (C504670Jqj.LIZIZ(strLIZ)) {
                return 0;
            }
            return CastIntegerProtector.parseInt(strLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
