package X;

import Y.ARunnableS86S0200000_17;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.LevelBarrageQueueSizeSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090710eUP {
    public final InterfaceC1090750eUT LIZ;
    public BarrageMessage LJIIIZ;
    public final CopyOnWriteArrayList<BarrageMessage> LIZIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<BarrageMessage> LIZJ = new CopyOnWriteArrayList<>();
    public boolean LIZLLL = true;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final boolean LJI = UserLevelBarrageSwitchSettings.INSTANCE.getValue();
    public final int LJII = LevelBarrageQueueSizeSetting.INSTANCE.getValue();
    public final ConcurrentHashMap<BarrageMessage, InterfaceC1102120emo> LJIIIIZZ = new ConcurrentHashMap<>();
    public C1090660eUK LJ = new C1090660eUK();

    public final void LJFF() {
        if (((SlotBarrageWidget) this.LIZ).x1(null)) {
            return;
        }
        ((SlotBarrageWidget) this.LIZ).I1(null);
    }

    public C1090710eUP(InterfaceC1090750eUT interfaceC1090750eUT) {
        this.LIZ = interfaceC1090750eUT;
    }

    public static int LIZIZ(BarrageMessage barrageMessage) {
        DisplayControl displayControl = barrageMessage.control;
        if (displayControl != null) {
            return displayControl.priority;
        }
        int i = barrageMessage.msgType;
        int i2 = 2;
        if (i != 2 && i != 6) {
            if (i != 13) {
                if (i != 14) {
                    i2 = 0;
                    switch (i) {
                        case 8:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            return Math.max(C1090780eUW.LJI(barrageMessage), 0);
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return 20;
                    }
                }
                return i2;
            }
            return 30;
        }
        return 1;
    }

    public final void LIZ(final BarrageMessage barrageMessage) {
        String str;
        boolean zU61;
        String accessKey;
        String accessKey2;
        String str2;
        if (barrageMessage != null) {
            int i = barrageMessage.msgType;
            String str3 = "";
            if (i != 100) {
                switch (i) {
                    case 8:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        int iLJI = C1090780eUW.LJI(barrageMessage);
                        if (iLJI > -1) {
                            BarrageGradeResConfig barrageGradeResConfigLJIIJJI = C1090780eUW.LJIIJJI(iLJI, barrageMessage.msgType);
                            if (barrageGradeResConfigLJIIJJI != null) {
                                str = barrageGradeResConfigLJIIJJI.barrageChannel;
                            } else {
                                str = null;
                            }
                            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                            IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                            if (iHostResource2 != null) {
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                zU61 = iHostResource2.u61(str2);
                            } else {
                                zU61 = false;
                            }
                            String str4 = "unknown";
                            if (!zU61 && this.LJI) {
                                if (str != null) {
                                    str3 = str;
                                }
                                if (!a0.LJJJIL(str3)) {
                                    final IHostResource iHostResource3 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                                    final long jCurrentTimeMillis = System.currentTimeMillis();
                                    final String str5 = str3;
                                    ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).nd1(new AbstractC1552040qUU() { // from class: X.0eUM
                                        @Override // X.AbstractC1552040qUU
                                        public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                                            String accessKey3;
                                            Integer numValueOf;
                                            String message;
                                            int iLIZIZ;
                                            String message2;
                                            IHostResource iHostResource4 = iHostResource3;
                                            String message3 = null;
                                            if (iHostResource4 != null) {
                                                accessKey3 = iHostResource4.getAccessKey();
                                            } else {
                                                accessKey3 = null;
                                            }
                                            String str6 = str5;
                                            Integer numValueOf2 = Integer.valueOf(C1090780eUW.LJI(barrageMessage));
                                            BarrageMessage barrageMessage2 = barrageMessage;
                                            if (barrageMessage2 != null) {
                                                numValueOf = Integer.valueOf(barrageMessage2.msgType);
                                            } else {
                                                numValueOf = null;
                                            }
                                            Boolean bool = Boolean.FALSE;
                                            Boolean boolValueOf = Boolean.valueOf(this.LIZ.LIZLLL);
                                            if (th != null) {
                                                message = th.getMessage();
                                            } else {
                                                message = null;
                                            }
                                            C1090630eUH.LJI(accessKey3, str6, numValueOf2, numValueOf, bool, boolValueOf, message);
                                            C1090710eUP c1090710eUP = this.LIZ;
                                            if (c1090710eUP.LJ != null) {
                                                BarrageMessage barrageMessage3 = barrageMessage;
                                                String str7 = str5;
                                                boolean z = c1090710eUP.LIZLLL;
                                                if (th != null) {
                                                    message2 = th.getMessage();
                                                } else {
                                                    message2 = null;
                                                }
                                                C1090660eUK.LIZ(barrageMessage3, false, str7, z, message2);
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onUpdateFailed channel: ");
                                            sbLIZ.append(str5);
                                            sbLIZ.append(", msg:");
                                            if (th != null) {
                                                message3 = th.getMessage();
                                            }
                                            sbLIZ.append(message3);
                                            sbLIZ.append(' ');
                                            C20441214yg.LJIIIZ("BarrageQueueController", C2188811AlT.LIZIZ(sbLIZ));
                                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                            BarrageMessage barrageMessage4 = barrageMessage;
                                            String str8 = str5;
                                            if (th != null) {
                                                iLIZIZ = C512300K7g.LIZIZ(th);
                                            } else {
                                                iLIZIZ = -1;
                                            }
                                            C1090630eUH.LIZJ(barrageMessage4, str8, iLIZIZ, jCurrentTimeMillis2);
                                        }

                                        @Override // X.AbstractC1552040qUU
                                        public final void LJIL(long j, UpdatePackage updatePackage) {
                                            String accessKey3;
                                            C1090710eUP c1090710eUP = this.LIZ;
                                            C786410Ut5.LJJZZIII(c1090710eUP.LJFF, new ARunnableS86S0200000_17(c1090710eUP, barrageMessage, 44));
                                            IHostResource iHostResource4 = iHostResource3;
                                            Integer numValueOf = null;
                                            if (iHostResource4 != null) {
                                                accessKey3 = iHostResource4.getAccessKey();
                                            } else {
                                                accessKey3 = null;
                                            }
                                            String str6 = str5;
                                            Integer numValueOf2 = Integer.valueOf(C1090780eUW.LJI(barrageMessage));
                                            BarrageMessage barrageMessage2 = barrageMessage;
                                            if (barrageMessage2 != null) {
                                                numValueOf = Integer.valueOf(barrageMessage2.msgType);
                                            }
                                            C1090630eUH.LJI(accessKey3, str6, numValueOf2, numValueOf, Boolean.TRUE, Boolean.valueOf(this.LIZ.LIZLLL), "");
                                            C1090710eUP c1090710eUP2 = this.LIZ;
                                            if (c1090710eUP2.LJ != null) {
                                                C1090660eUK.LIZ(barrageMessage, true, str5, c1090710eUP2.LIZLLL, "");
                                            }
                                            C1090630eUH.LIZJ(barrageMessage, str5, 0, System.currentTimeMillis() - jCurrentTimeMillis);
                                        }
                                    }, str3);
                                }
                                if (iHostResource != null) {
                                    accessKey2 = iHostResource.getAccessKey();
                                } else {
                                    accessKey2 = null;
                                }
                                C1090630eUH.LJFF(accessKey2, str, Integer.valueOf(iLJI), Integer.valueOf(barrageMessage.msgType), Boolean.FALSE);
                                if (this.LJ != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    if (str != null) {
                                        str4 = str;
                                    }
                                    C0K04.LJFF("channel", str4, jSONObject);
                                    C0K04.LIZLLL(barrageMessage.msgType, "barrage_msg_type", jSONObject);
                                    C0K04.LIZLLL(C1090780eUW.LJI(barrageMessage), "barrage_grade", jSONObject);
                                    C1CC2.LJIIIIZZ("grade_channel_check_exit_event", 1, jSONObject);
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("addMessage channel: ");
                                sbLIZ.append(str);
                                sbLIZ.append(", not Exist ");
                                C20441214yg.LJIIIZ("BarrageQueueController", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                LIZJ(barrageMessage);
                                if (iHostResource != null) {
                                    accessKey = iHostResource.getAccessKey();
                                } else {
                                    accessKey = null;
                                }
                                C1090630eUH.LJFF(accessKey, str, Integer.valueOf(iLJI), Integer.valueOf(barrageMessage.msgType), Boolean.TRUE);
                                if (this.LJ != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    if (str == null) {
                                        str = "unknown";
                                    }
                                    C0K04.LJFF("channel", str, jSONObject2);
                                    C0K04.LIZLLL(barrageMessage.msgType, "barrage_msg_type", jSONObject2);
                                    C0K04.LIZLLL(C1090780eUW.LJI(barrageMessage), "barrage_grade", jSONObject2);
                                    C1CC2.LJIIIIZZ("grade_channel_check_exit_event", 0, jSONObject2);
                                }
                                C1090630eUH.LIZJ(barrageMessage, "", 0, 0L);
                            }
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        LIZJ(barrageMessage);
                        C1090630eUH.LIZJ(barrageMessage, "", 0, 0L);
                        break;
                    default:
                        LIZJ(barrageMessage);
                        C1090630eUH.LIZJ(barrageMessage, "", 0, 0L);
                        break;
                }
                return;
            }
            ImageModel imageModelY1 = ((SlotBarrageWidget) this.LIZ).y1(barrageMessage);
            if (imageModelY1 != null) {
                IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                if (iHostFrescoHelper != null) {
                    iHostFrescoHelper.xW1(imageModelY1, new InterfaceC177000m8() { // from class: X.0eUR
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap) {
                            C1090710eUP c1090710eUP = this.LIZ;
                            if (c1090710eUP.LIZLLL) {
                                c1090710eUP.LIZJ(barrageMessage);
                                this.LIZ.LJFF();
                            }
                        }
                    });
                }
            } else {
                LIZJ(barrageMessage);
                LJFF();
            }
            C1090630eUH.LIZJ(barrageMessage, "", 0, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r1 = r6.LIZIZ.size();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage r7) {
        /*
            r6 = this;
            boolean r0 = r7.isLocalInsertMsg
            r5 = 0
            if (r0 == 0) goto L6b
            com.bytedance.android.livesdk.message.proto.DisplayControl r0 = r7.control
            if (r0 == 0) goto L69
            int r3 = r0.priority
        Lb:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.model.message.BarrageMessage r0 = (com.bytedance.android.livesdk.model.message.BarrageMessage) r0
            com.bytedance.android.livesdk.message.proto.DisplayControl r0 = r0.control
            if (r0 == 0) goto L67
            int r0 = r0.priority
        L24:
            if (r3 <= r0) goto L64
            if (r1 >= 0) goto L2e
        L28:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            int r1 = r0.size()
        L2e:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            r0.add(r1, r7)
        L33:
            r6.LIZLLL(r7)
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            int r1 = r0.size()
            int r0 = r6.LJII
            if (r1 <= r0) goto L4c
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r2 = r6.LIZJ
            int r1 = r2.size()
            int r0 = r6.LJII
            int r1 = r1 - r0
            r6.LJ(r2, r7, r1, r5)
        L4c:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            int r1 = r0.size()
            int r0 = r6.LJII
            if (r1 <= r0) goto L63
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r2 = r6.LIZIZ
            int r1 = r2.size()
            int r0 = r6.LJII
            int r1 = r1 - r0
            r0 = 1
            r6.LJ(r2, r7, r1, r0)
        L63:
            return
        L64:
            int r1 = r1 + 1
            goto L12
        L67:
            r0 = -1
            goto L24
        L69:
            r3 = -1
            goto Lb
        L6b:
            int r4 = LIZIZ(r7)
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L76:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r1 = r3.next()
            com.bytedance.android.livesdk.model.message.BarrageMessage r1 = (com.bytedance.android.livesdk.model.message.BarrageMessage) r1
            int r0 = LIZIZ(r1)
            if (r4 > r0) goto L96
            if (r4 != r0) goto La4
            boolean r0 = X.C1090780eUW.LJ(r7)
            if (r0 == 0) goto La4
            boolean r0 = X.C1090780eUW.LJ(r1)
            if (r0 != 0) goto La4
        L96:
            if (r2 >= 0) goto L9e
        L98:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            int r2 = r0.size()
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            r0.add(r2, r7)
            goto L33
        La4:
            int r2 = r2 + 1
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1090710eUP.LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(final BarrageMessage barrageMessage) {
        final boolean zLJJIIZ;
        if (barrageMessage != null && !this.LJIIIIZZ.contains(barrageMessage)) {
            SlotBarrageWidget slotBarrageWidget = (SlotBarrageWidget) this.LIZ;
            boolean z = false;
            if (slotBarrageWidget.LLIZLLLIL != null) {
                zLJJIIZ = C500260Jjc.LJJIIZ(C1090780eUW.LJIIIZ(barrageMessage));
            } else {
                zLJJIIZ = false;
            }
            C1090870eUf c1090870eUf = slotBarrageWidget.LLJJI;
            if (c1090870eUf != null) {
                c1090870eUf.LJI.getClass();
                String str = barrageMessage.schema;
                if (str != null && str.length() > 0) {
                    z = true;
                }
                zLJJIIZ |= z;
            }
            final InterfaceC1090750eUT interfaceC1090750eUT = this.LIZ;
            InterfaceC1102120emo interfaceC1102120emo = new InterfaceC1102120emo(barrageMessage, zLJJIIZ, interfaceC1090750eUT) { // from class: X.0eUQ
                public final BarrageMessage LIZ;
                public final boolean LIZIZ;
                public final InterfaceC1090750eUT LIZJ;
                public final long LIZLLL;
                public final C1090650eUJ LJ;

                @Override // X.InterfaceC1102120emo
                public final boolean LIZJ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.InterfaceC1102120emo
                public final void LJI() {
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIIIZZ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC1102120emo
                public final Boolean LJIIL() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final String LIZIZ() {
                    String str2;
                    C1090650eUJ c1090650eUJ = this.LJ;
                    return (c1090650eUJ == null || (str2 = c1090650eUJ.LIZ) == null) ? "" : str2;
                }

                @Override // X.InterfaceC1102120emo
                public final String LJJJ() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final String getBusinessName() {
                    String str2;
                    C1090650eUJ c1090650eUJ = this.LJ;
                    return (c1090650eUJ == null || (str2 = c1090650eUJ.LIZIZ) == null) ? "" : str2;
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final EnumC245600xC LIZLLL() {
                    return C245700xD.LIZ(this);
                }

                @Override // X.InterfaceC1102120emo
                public final int getComponentType() {
                    return ((SlotBarrageWidget) LJII()).getComponentType();
                }

                @Override // X.InterfaceC1102120emo
                public final InterfaceC1102150emr LJII() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIILIIL() {
                    return this.LIZIZ;
                }

                {
                    long jLIZIZ;
                    this.LIZ = barrageMessage;
                    this.LIZIZ = zLJJIIZ;
                    this.LIZJ = interfaceC1090750eUT;
                    CommonMessageData commonMessageData = barrageMessage.baseMessage;
                    if (commonMessageData != null) {
                        jLIZIZ = commonMessageData.createTime;
                    } else {
                        jLIZIZ = C963140bAe.LIZIZ();
                    }
                    this.LIZLLL = jLIZIZ;
                    this.LJ = C1090700eUO.LIZ(barrageMessage);
                }
            };
            this.LJIIIIZZ.put(barrageMessage, interfaceC1102120emo);
            C1102070emj c1102070emj = C1102070emj.LIZ;
            InterfaceC1090750eUT interfaceC1090750eUT2 = this.LIZ;
            DataChannel dataChannel = ((LiveWidget) interfaceC1090750eUT2).dataChannel;
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannel, interfaceC1090750eUT2, interfaceC1102120emo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(CopyOnWriteArrayList<BarrageMessage> copyOnWriteArrayList, BarrageMessage barrageMessage, int i, boolean z) {
        int i2;
        Map map;
        int i3 = 0;
        boolean z2 = false;
        if (1 <= i) {
            int i4 = 1;
            while (true) {
                AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) C19719612Di.LJJIJ(copyOnWriteArrayList);
                InterfaceC1102120emo interfaceC1102120emoRemove = this.LJIIIIZZ.remove(abstractC1136060ffY);
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel = ((LiveWidget) this.LIZ).dataChannel;
                c1102070emj.getClass();
                if (dataChannel != null && interfaceC1102120emoRemove != null && (map = (Map) ((LinkedHashMap) C1102070emj.LIZIZ).get(dataChannel)) != null) {
                    map.remove(interfaceC1102120emoRemove.getId());
                }
                if (!z2 && barrageMessage.getMessageId() == abstractC1136060ffY.getMessageId()) {
                    z2 = true;
                }
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        C1091120eV4.LIZ(barrageMessage, "bufferOverSize");
        if (this.LJ != null) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LIZLLL(i, "delete_size", jSONObject);
            C0K04.LJIIIZ(jSONObject, "queue_type", z);
            C0K04.LJIIIZ(jSONObject, "delete_insert_msg", z2);
            C1CC2.LJIIIIZZ("grade_delete_more_msg_event", 0, jSONObject);
        }
        Integer numValueOf = Integer.valueOf(i);
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        DisplayControl displayControl = barrageMessage.control;
        if (displayControl != null) {
            i2 = displayControl.priority;
        } else {
            i2 = -1;
        }
        Integer numValueOf2 = Integer.valueOf(i2);
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_barrage_removed_from_queue", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIL();
            C1090630eUH.LIZ(c474500IjALIZIZ, barrageMessage, C1090700eUO.LIZ(barrageMessage));
            c474500IjALIZIZ.LJJII(numValueOf, "delete_size");
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool)) {
                i3 = 1;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i3), "queue_type");
            c474500IjALIZIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(boolValueOf2, bool) ? 1 : 0), "delete_insert_msg");
            c474500IjALIZIZ.LJJII(Integer.valueOf(barrageMessage.msgType), "barrage_type");
            c474500IjALIZIZ.LJJII(numValueOf2, "priority");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
