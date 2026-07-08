package X;

import android.view.View;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleMessageWindowFocusExperiment;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsModeratorGuide;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0f3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112360f3K {
    public static final C1112360f3K LIZ = new C1112360f3K();
    public static final Map<DataChannel, Map<CapsuleMessage, C245300x9>> LIZIZ = new LinkedHashMap();
    public static final Map<DataChannel, List<CapsuleMessage>> LIZJ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
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
    public static boolean LIZ(DataChannel dataChannel, CapsuleMessage capsuleMessage, View view) {
        InterfaceC1102120emo interfaceC1102120emo;
        String str;
        if (dataChannel == null) {
            return false;
        }
        Map<DataChannel, Map<CapsuleMessage, C245300x9>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Map linkedHashMap2 = (Map) linkedHashMap.get(dataChannel);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            map.put(dataChannel, (Map<CapsuleMessage, C245300x9>) linkedHashMap2);
        }
        if (linkedHashMap2.containsKey(capsuleMessage)) {
            return false;
        }
        C245300x9 c245300x9 = null;
        Object[] objArr = 0;
        if (LiveCapsuleMessageWindowFocusExperiment.INSTANCE.getEnable()) {
            interfaceC1102120emo = new InterfaceC1102120emo(capsuleMessage, view) { // from class: X.00x9
                public final CapsuleMessage LIZ;
                public final View LIZIZ;
                public final long LIZJ;

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
                public final String LIZIZ() {
                    return this.LIZ.subScene;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    View view2 = this.LIZIZ;
                    return new C1099880ejC(view2 != null ? view2.hasWindowFocus() : false);
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    View view2 = this.LIZIZ;
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
                    return this.LIZ.scene;
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    String str2;
                    CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    CapsuleBizParams capsuleBizParams = this.LIZ.bizParams;
                    if (capsuleBizParams != null && (capsuleBizParamsModeratorGuide = capsuleBizParams.moderatorGuideInfo) != null) {
                        linkedHashMap3.put("is_gifter_moderator", capsuleBizParamsModeratorGuide.isGiftModerator ? "1" : CardStruct.IStatusCode.DEFAULT);
                        linkedHashMap3.put("is_interactive_moderator", capsuleBizParamsModeratorGuide.isInteractiveModerator ? "1" : CardStruct.IStatusCode.DEFAULT);
                        linkedHashMap3.put("is_tool_moderator", !capsuleBizParamsModeratorGuide.isToolModerator ? CardStruct.IStatusCode.DEFAULT : "1");
                    }
                    Text text = this.LIZ.desc;
                    if (text != null && (str2 = text.defaultPattern) != null) {
                        linkedHashMap3.put("content", str2);
                    }
                    List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(this.LIZ.capsuleType);
                    if (listZ51 != null) {
                        for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                            if (interfaceC1112400f3O != null) {
                                interfaceC1112400f3O.LIZIZ(this.LIZ, linkedHashMap3);
                            }
                        }
                    }
                    return linkedHashMap3;
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return String.valueOf(this.LIZ.hashCode());
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
                    return C1112250f39.LL;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZJ;
                }

                {
                    long jLIZIZ;
                    this.LIZ = capsuleMessage;
                    this.LIZIZ = view;
                    CommonMessageData commonMessageData = capsuleMessage.baseMessage;
                    if (commonMessageData != null) {
                        jLIZIZ = commonMessageData.createTime;
                    } else {
                        jLIZIZ = C963140bAe.LIZIZ();
                    }
                    this.LIZJ = jLIZIZ;
                }
            };
        } else {
            interfaceC1102120emo = new InterfaceC1102120emo(capsuleMessage, objArr == true ? 1 : 0) { // from class: X.00x9
                public final CapsuleMessage LIZ;
                public final View LIZIZ;
                public final long LIZJ;

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
                public final String LIZIZ() {
                    return this.LIZ.subScene;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    View view2 = this.LIZIZ;
                    return new C1099880ejC(view2 != null ? view2.hasWindowFocus() : false);
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    View view2 = this.LIZIZ;
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
                    return this.LIZ.scene;
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    String str2;
                    CapsuleBizParamsModeratorGuide capsuleBizParamsModeratorGuide;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    CapsuleBizParams capsuleBizParams = this.LIZ.bizParams;
                    if (capsuleBizParams != null && (capsuleBizParamsModeratorGuide = capsuleBizParams.moderatorGuideInfo) != null) {
                        linkedHashMap3.put("is_gifter_moderator", capsuleBizParamsModeratorGuide.isGiftModerator ? "1" : CardStruct.IStatusCode.DEFAULT);
                        linkedHashMap3.put("is_interactive_moderator", capsuleBizParamsModeratorGuide.isInteractiveModerator ? "1" : CardStruct.IStatusCode.DEFAULT);
                        linkedHashMap3.put("is_tool_moderator", !capsuleBizParamsModeratorGuide.isToolModerator ? CardStruct.IStatusCode.DEFAULT : "1");
                    }
                    Text text = this.LIZ.desc;
                    if (text != null && (str2 = text.defaultPattern) != null) {
                        linkedHashMap3.put("content", str2);
                    }
                    List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(this.LIZ.capsuleType);
                    if (listZ51 != null) {
                        for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                            if (interfaceC1112400f3O != null) {
                                interfaceC1112400f3O.LIZIZ(this.LIZ, linkedHashMap3);
                            }
                        }
                    }
                    return linkedHashMap3;
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return String.valueOf(this.LIZ.hashCode());
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
                    return C1112250f39.LL;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZJ;
                }

                {
                    long jLIZIZ;
                    this.LIZ = capsuleMessage;
                    this.LIZIZ = view;
                    CommonMessageData commonMessageData = capsuleMessage.baseMessage;
                    if (commonMessageData != null) {
                        jLIZIZ = commonMessageData.createTime;
                    } else {
                        jLIZIZ = C963140bAe.LIZIZ();
                    }
                    this.LIZJ = jLIZIZ;
                }
            };
        }
        linkedHashMap2.put(capsuleMessage, interfaceC1102120emo);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1112250f39 c1112250f39 = C1112250f39.LL;
        c1102070emj.getClass();
        C1102070emj.LJJIII(dataChannel, c1112250f39, interfaceC1102120emo);
        c1102070emj.LJJI(dataChannel, c1112250f39, interfaceC1102120emo, null);
        if (!capsuleMessage.skipFc) {
            HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                str = "in_room";
            } else {
                str = "watch";
            }
            C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(4, dataChannel, str, false, false);
            if (!c512940K9sLIZLLL.LIZ) {
                Set<String> set = c512940K9sLIZLLL.LIZIZ;
                Map map3 = (Map) linkedHashMap.get(dataChannel);
                if (map3 != null) {
                    c245300x9 = (C245300x9) map3.get(capsuleMessage);
                }
                c1102070emj.LJIILL(dataChannel, c1112250f39, c245300x9, set);
                Map map4 = (Map) linkedHashMap.get(dataChannel);
                if (map4 != null) {
                    map4.remove(capsuleMessage);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(DataChannel dataChannel, CapsuleMessage capsuleMessage, C0KAJ c0kaj) {
        C245300x9 c245300x9;
        if (dataChannel == null) {
            return;
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1112250f39 c1112250f39 = C1112250f39.LL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Map map = (Map) linkedHashMap.get(dataChannel);
        if (map != null) {
            c245300x9 = (C245300x9) map.get(capsuleMessage);
        } else {
            c245300x9 = null;
        }
        C1102070emj.LJIILJJIL(c1102070emj, dataChannel, c1112250f39, c245300x9, c0kaj, null, null, 112);
        if (c0kaj != C0KAJ.MANUALLY_ROUTE) {
            Map map2 = (Map) linkedHashMap.get(dataChannel);
            if (map2 != null) {
                map2.remove(capsuleMessage);
            }
            List list = (List) ((LinkedHashMap) LIZJ).get(dataChannel);
            if (list != null) {
                list.remove(capsuleMessage);
            }
        }
    }
}
