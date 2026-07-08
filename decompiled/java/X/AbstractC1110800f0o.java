package X;

import X.AbstractC1136060ffY;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastMessageSortSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1110800f0o<MESSAGE extends AbstractC1136060ffY> extends AbstractC1110790f0n {
    public final MESSAGE LJIL;
    public boolean LJJ;

    public String LLJJJJJIL() {
        return "";
    }

    public UserIdentity LLJJJJLIIL() {
        return null;
    }

    public boolean LLJJLIIIJLLLLLLLZ() {
        return false;
    }

    public boolean LLJL() {
        return this instanceof C1110640f0Y;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJFF() {
        return this.LJIL.isHistoryMessage;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public boolean LJJJJZI() {
        return !this.LJIL.isHistoryMessage;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final long LJJJLIIL() {
        return this.LJIL.localTimestamp;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final long LJLILLLLZI() {
        CommonMessageData commonMessageData = this.LJIL.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.createTime;
        }
        return 0L;
    }

    @Override // X.AbstractC1110790f0n
    public Text LLFZ() {
        CommonMessageData commonMessageData = this.LJIL.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.displayText;
        }
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final String LLII() {
        return this.LJIL.baseMessage.logId;
    }

    @Override // X.AbstractC1110790f0n
    public boolean LLJJIJIL() {
        return this.LJIL.supportDisplayText();
    }

    public String LLJJJJ() {
        String methodName = this.LJIL.getMethodName();
        return methodName == null ? "Unkown" : methodName;
    }

    public final boolean LLJJL() {
        MESSAGE message = this.LJIL;
        MemberMessage memberMessage = message instanceof MemberMessage ? (MemberMessage) message : null;
        return memberMessage != null && memberMessage.action == 46;
    }

    @Override // X.InterfaceC1111870f2X
    public final long getMessageId() {
        CommonMessageData commonMessageData = this.LJIL.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.messageId;
        }
        return 0L;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public boolean instant() {
        if (this.LJIL.isHistoryMessage) {
            return false;
        }
        return super.instant();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public int LJIIL() {
        return (!LLIIIILZ().LIZLLL || LLIIIILZ().LJJ) ? super.LJIIL() : C1152540g68.LJIIIZ(LLIIIILZ().LJI);
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public boolean LJJJJ() {
        return LLJJJIL() == 0 ? LLJJ() : LLJJJIL() == 1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJLJJI() {
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
        return LLIIIILZ().LJI && (publicAreaMessageCommonLLIIII = LLIIII()) != null && publicAreaMessageCommonLLIIII.isAnchorMarked;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public int LJLLLL() {
        return (!LLIIIILZ().LIZLLL || LLIIIILZ().LJJ) ? super.LJLLLL() : C1152540g68.LJII(LLIIIILZ().LJI);
    }

    public final String LLJJJ() {
        UserAttr userAttr;
        if (LLIIIILZ().LJI) {
            return "anchor";
        }
        User userLIZLLL = LLIIIILZ().LIZLLL();
        return (userLIZLLL == null || (userAttr = userLIZLLL.getUserAttr()) == null || !userAttr.isAdmin) ? "viewer" : "admin";
    }

    public final long LLJJJIL() {
        Long l;
        if (LLIILII()) {
            CommonMessageData commonMessageData = this.LJIL.baseMessage;
            if (commonMessageData == null || (l = commonMessageData.anchorFoldType) == null) {
                return 0L;
            }
            return l.longValue();
        }
        if (!LLIIL()) {
            CommonMessageData commonMessageData2 = this.LJIL.baseMessage;
            if (commonMessageData2 != null) {
                return commonMessageData2.foldType;
            }
            return 0L;
        }
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        if (publicAreaMessageCommonLLIIII != null) {
            return publicAreaMessageCommonLLIIII.adminFoldType;
        }
        CommonMessageData commonMessageData3 = this.LJIL.baseMessage;
        if (commonMessageData3 != null) {
            return commonMessageData3.foldType;
        }
        return 0L;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public void dispose() {
        super.dispose();
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        if (publicAreaMessageCommonLLIIII == null || publicAreaMessageCommonLLIIII.operationInfo == null) {
            return;
        }
        C1110810f0p c1110810f0p = C1110810f0p.LIZ;
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        C0KAJ c0kaj = C0KAJ.AUTO_TERMINATE;
        c1110810f0p.getClass();
        C1110810f0p.LIZ(dataChannel, this, c0kaj);
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public int getColor() {
        return (!LLIIIILZ().LIZLLL || LLIIIILZ().LJJ) ? super.getColor() : C1152540g68.LJII(LLIIIILZ().LJI);
    }

    public long getPriority() {
        if (!LLIILII()) {
            CommonMessageData commonMessageData = this.LJIL.baseMessage;
            if (commonMessageData != null) {
                return commonMessageData.priorityScore;
            }
            return 0L;
        }
        if (!LiveBroadcastMessageSortSetting.INSTANCE.isInExperiment()) {
            CommonMessageData commonMessageData2 = this.LJIL.baseMessage;
            if (commonMessageData2 != null) {
                return commonMessageData2.anchorPriorityScore;
            }
            return 0L;
        }
        long j = this.LJFF;
        if (j != -1 && j != -1) {
            return j;
        }
        CommonMessageData commonMessageData3 = this.LJIL.baseMessage;
        if (commonMessageData3 != null) {
            return commonMessageData3.anchorPriorityScore;
        }
        return 0L;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public void onAttach() {
        PublicAreaMessageCommon.OperationInfo operationInfo;
        super.onAttach();
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        C246000xG c246000xG = null;
        operationState = null;
        PublicAreaMessageCommon.OperationState operationState = null;
        if (publicAreaMessageCommonLLIIII != null && publicAreaMessageCommonLLIIII.operationInfo != null) {
            C1110810f0p c1110810f0p = C1110810f0p.LIZ;
            C1109770ez9 c1109770ez9LLIIIILZ = LLIIIILZ();
            c1110810f0p.getClass();
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
            C1110870f0v c1110870f0v = C1110870f0v.LL;
            Map map = (Map) ((LinkedHashMap) C1110810f0p.LIZIZ).get(dataChannel);
            if (map != null) {
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = LLIIII();
                if (publicAreaMessageCommonLLIIII2 != null && (operationInfo = publicAreaMessageCommonLLIIII2.operationInfo) != null) {
                    operationState = operationInfo.initialState;
                }
                c246000xG = (C246000xG) map.get(operationState);
            }
            c1102070emj.LJIIJ(dataChannel, c1110870f0v, c246000xG, null);
        }
        if (!LLIIIILZ().LJIJJLI || this.LJJ) {
            return;
        }
        if (C500260Jjc.LJJIJ(LLJJJJJIL())) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sys_message_guide_show");
            c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
            c474500IjALIZ.LJJII(LLJJJJJIL(), Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(LLIILII() ? "anchor" : LLIIL() ? "admin" : "viewer", "user_type");
            c474500IjALIZ.LJJII(LLIIIJ(), "reason_id");
            c474500IjALIZ.LIZ();
        }
        this.LJJ = true;
    }

    public AbstractC1110800f0o(MESSAGE message) {
        super(message.getMessageId());
        this.LJIL = message;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public void LJJJJL(boolean z) {
        PublicAreaMessageCommon.OperationInfo operationInfo;
        super.LJJJJL(z);
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        C246000xG c246000xG = null;
        operationState = null;
        PublicAreaMessageCommon.OperationState operationState = null;
        if (publicAreaMessageCommonLLIIII != null && publicAreaMessageCommonLLIIII.operationInfo != null) {
            C1110810f0p c1110810f0p = C1110810f0p.LIZ;
            C1109770ez9 c1109770ez9LLIIIILZ = LLIIIILZ();
            c1110810f0p.getClass();
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
            C1110870f0v c1110870f0v = C1110870f0v.LL;
            Map map = (Map) ((LinkedHashMap) C1110810f0p.LIZIZ).get(dataChannel);
            if (map != null) {
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = LLIIII();
                if (publicAreaMessageCommonLLIIII2 != null && (operationInfo = publicAreaMessageCommonLLIIII2.operationInfo) != null) {
                    operationState = operationInfo.initialState;
                }
                c246000xG = (C246000xG) map.get(operationState);
            }
            c1102070emj.getClass();
            C1102070emj.LJIILLIIL(dataChannel, c1110870f0v, c246000xG);
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public void LJJJJZ(C1109770ez9 c1109770ez9) {
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
        PublicAreaMessageCommon.OperationInfo operationInfo;
        final PublicAreaMessageCommon.OperationState operationState;
        final View view;
        super.LJJJJZ(c1109770ez9);
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = LLIIII();
        if (publicAreaMessageCommonLLIIII2 != null && publicAreaMessageCommonLLIIII2.operationInfo != null) {
            C1110810f0p c1110810f0p = C1110810f0p.LIZ;
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            c1110810f0p.getClass();
            if (dataChannel != null && (publicAreaMessageCommonLLIIII = LLIIII()) != null && (operationInfo = publicAreaMessageCommonLLIIII.operationInfo) != null && (operationState = operationInfo.initialState) != null && !(!Intrinsics.LJFF(operationState.scene, "wave"))) {
                Map<DataChannel, Map<PublicAreaMessageCommon.OperationState, C246000xG>> map = C1110810f0p.LIZIZ;
                Map linkedHashMap = (Map) ((LinkedHashMap) map).get(dataChannel);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    map.put(dataChannel, (Map<PublicAreaMessageCommon.OperationState, C246000xG>) linkedHashMap);
                }
                Reference reference = (Reference) ((LinkedHashMap) C1110810f0p.LIZJ).get(dataChannel);
                if (reference != null) {
                    view = (View) reference.get();
                } else {
                    view = null;
                }
                final MESSAGE message = this.LJIL;
                InterfaceC1102120emo interfaceC1102120emo = new InterfaceC1102120emo(message, operationState, view) { // from class: X.00xG
                    public final AbstractC1136060ffY LIZ;
                    public final PublicAreaMessageCommon.OperationState LIZIZ;
                    public final View LIZJ;

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
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIIIIZZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIIJJI() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final Boolean LJIIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final boolean LJIILIIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final Map<String, String> getExtras() {
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String LIZIZ() {
                        MemberMessage memberMessage;
                        AbstractC1136060ffY abstractC1136060ffY = this.LIZ;
                        if ((abstractC1136060ffY instanceof MemberMessage) && (memberMessage = (MemberMessage) abstractC1136060ffY) != null && memberMessage.action == 46) {
                            return "new_user_not_follow";
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final C1099880ejC LJIIIZ() {
                        View rootView;
                        View view2 = this.LIZJ;
                        return new C1099880ejC((view2 == null || (rootView = view2.getRootView()) == null) ? false : rootView.hasWindowFocus());
                    }

                    @Override // X.InterfaceC1102120emo
                    public final long LJIIJ() {
                        return this.LIZ.baseMessage.createTime;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final View LJIILJJIL() {
                        View view2 = this.LIZJ;
                        if (view2 != null) {
                            return view2.getRootView();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String LJJJ() {
                        return String.valueOf(this.LIZ.getMessageId());
                    }

                    @Override // X.InterfaceC1102120emo
                    public final String getBusinessName() {
                        return this.LIZIZ.scene;
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
                        LJII();
                        return 0;
                    }

                    @Override // X.InterfaceC1102120emo
                    public final InterfaceC1102150emr LJII() {
                        return C1110870f0v.LL;
                    }

                    {
                        this.LIZ = message;
                        this.LIZIZ = operationState;
                        this.LIZJ = view;
                    }
                };
                linkedHashMap.put(operationState, interfaceC1102120emo);
                C1102070emj c1102070emj = C1102070emj.LIZ;
                C1110870f0v c1110870f0v = C1110870f0v.LL;
                c1102070emj.getClass();
                C1102070emj.LJJIII(dataChannel, c1110870f0v, interfaceC1102120emo);
                c1102070emj.LJJI(dataChannel, c1110870f0v, interfaceC1102120emo, null);
            }
        }
    }

    @Override // X.InterfaceC1112690f3r
    public void LJJJLZIJ(long j) {
        if (LLIILII()) {
            CommonMessageData commonMessageData = this.LJIL.baseMessage;
            if (commonMessageData != null) {
                commonMessageData.anchorPriorityScore = j;
                return;
            }
            return;
        }
        CommonMessageData commonMessageData2 = this.LJIL.baseMessage;
        if (commonMessageData2 == null) {
            return;
        }
        commonMessageData2.priorityScore = j;
    }
}
