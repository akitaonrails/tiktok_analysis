package X;

import android.text.Editable;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.interaction.InteractionFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.send.service.IMSendMessageService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZDT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDT {
    public static final C0ZDT LIZ = new C0ZDT();

    public static ByteString LIZIZ(String str) {
        IMSendMessageService iMSendMessageService = (IMSendMessageService) PluggableExtentionKt.pluggableSpiForReal(IMSendMessageService.class);
        if (iMSendMessageService != null) {
            return iMSendMessageService.LIZ(str);
        }
        return null;
    }

    public static FeatureAttachmentData LIZLLL(C459840I1m c459840I1m) {
        long jLongValue;
        AttachmentTypeComponent attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_THOUGHT;
        String str = c459840I1m.LIZ.thoughtId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c459840I1m.LIZIZ);
        long jLongValue2 = 0;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Long l = c459840I1m.LIZ.createTimeMs;
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        String str3 = c459840I1m.LIZ.textContent;
        if (str3 != null) {
            str2 = str3;
        }
        return new FeatureAttachmentData(attachmentTypeComponent, str, jLongValue, jLongValue2, new TextComponent(str2, null, null));
    }

    public static ReferenceInfo LJII(C869590Y9l c869590Y9l) {
        String str;
        BaseTemplate baseTemplateLIZ;
        PreviewHintComponent previewHintComponentYo;
        TextComponent textComponent;
        String strLJI = null;
        if (c869590Y9l == null) {
            return null;
        }
        String str2 = "";
        if (!C0ZDX.LJJJJLI(c869590Y9l) || (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) == null || (previewHintComponentYo = baseTemplateLIZ.yo()) == null || (textComponent = previewHintComponentYo.quotePreviewText) == null || (str = textComponent.text) == null) {
            str = "";
        }
        String content = c869590Y9l.getContent();
        if (content == null) {
            content = "";
        }
        String strValueOf = String.valueOf(c869590Y9l.getSender());
        String secSender = c869590Y9l.getSecSender();
        secSender.toString();
        int msgType = c869590Y9l.getMsgType();
        String str3 = c869590Y9l.getExt().get("a:src");
        String content2 = c869590Y9l.getContent();
        if (content2 != null) {
            str2 = content2;
        }
        InteractionFeature interactionFeatureLIZ = InteractionFeature.LIZ.LIZ();
        if (interactionFeatureLIZ != null) {
            strLJI = interactionFeatureLIZ.LJI(c869590Y9l);
        }
        ReferenceInfoHint referenceInfoHint = new ReferenceInfoHint(content, strValueOf, secSender, msgType, str3, str2, str, strLJI);
        C872750YLp c872750YLp = new C872750YLp();
        c872750YLp.LJ = C051M.LJ(referenceInfoHint, false);
        c872750YLp.LIZLLL = Long.valueOf(c869590Y9l.getMsgId());
        c872750YLp.LJFF = Long.valueOf(c869590Y9l.getMsgType());
        c872750YLp.LJI = c869590Y9l.getMessageStatus();
        c872750YLp.LJIIIZ = Long.valueOf(c869590Y9l.getSender());
        c872750YLp.LJIIJJI = str;
        return c872750YLp.build();
    }

    public static List LJIIIIZZ(Editable editable) {
        List<C0I1K> listLJJLL;
        ArrayList arrayList;
        C0I1L c0i1l;
        String str;
        C0I1M c0i1m;
        Object[] spans = editable.getSpans(0, editable.length(), C0I1K.class);
        if (spans != null) {
            listLJJLL = C13LQ.LJJLL(spans);
        } else {
            listLJJLL = null;
        }
        if (C866950Xzh.LIZIZ(listLJJLL)) {
            if (listLJJLL != null) {
                arrayList = new ArrayList();
                for (C0I1K c0i1k : listLJJLL) {
                    if (c0i1k != null && (c0i1l = c0i1k.LIZLLL) != null && (str = c0i1k.LIZIZ) != null) {
                        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                            c0i1m = C0I1M.MENTION_ALL;
                        } else {
                            c0i1m = C0I1M.MENTION_SINGLE;
                        }
                        int i = c0i1l.LIZ;
                        arrayList.add(new RichTextInfo(i, c0i1l.LIZIZ - i, c0i1m.getValue(), str, null, 0));
                    }
                }
            } else {
                arrayList = null;
            }
            if (C866950Xzh.LIZIZ(arrayList)) {
                return arrayList;
            }
        }
        return null;
    }

    public static QuoteMode LJIIJ(C0I20 c0i20) {
        InterfaceC454990Hsn interfaceC454990Hsn;
        AnonymousClass0951 anonymousClass0951Cf1;
        String str = null;
        if (c0i20 != null && (anonymousClass0951Cf1 = c0i20.cf1()) != null) {
            interfaceC454990Hsn = (InterfaceC454990Hsn) anonymousClass0951Cf1.getValue();
        } else {
            interfaceC454990Hsn = null;
        }
        if (interfaceC454990Hsn instanceof C454980Hsm) {
            ReferenceInfo referenceInfoLJII = LJII(((C454980Hsm) interfaceC454990Hsn).LIZ);
            if (referenceInfoLJII != null) {
                return new QuoteMode.Reply(referenceInfoLJII, true);
            }
            return QuoteMode.None.INSTANCE;
        }
        if (interfaceC454990Hsn instanceof C459840I1m) {
            FeatureAttachmentData featureAttachmentDataLIZLLL = LIZLLL((C459840I1m) interfaceC454990Hsn);
            String str2 = featureAttachmentDataLIZLLL.id;
            long j = featureAttachmentDataLIZLLL.uid;
            long j2 = featureAttachmentDataLIZLLL.originalCreateTime;
            TextComponent textComponent = featureAttachmentDataLIZLLL.content;
            if (textComponent != null) {
                str = textComponent.text;
            }
            return new QuoteMode.Thought(j, j2, true, str2, str);
        }
        if (interfaceC454990Hsn == null) {
            return QuoteMode.None.INSTANCE;
        }
        throw new C1954807lC();
    }

    public static ByteString LIZJ(C455010Hsp c455010Hsp, String str) {
        String str2;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        C2248791D0b c2248791D0b = new C2248791D0b();
        C897990ZKr c897990ZKr = new C897990ZKr();
        if (c455010Hsp != null) {
            str2 = c455010Hsp.LIZIZ;
        } else {
            str2 = null;
        }
        c897990ZKr.LIZLLL = str2;
        C905580Zfo c905580Zfo = new C905580Zfo();
        c905580Zfo.LJFF = str;
        c897990ZKr.LJII = c905580Zfo.build();
        c2248791D0b.LJFF = c897990ZKr.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, c2248791D0b.build().encode());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.ByteString LJIIIZ(okio.ByteString r3, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData r4) {
        /*
            if (r4 != 0) goto L3
            return r3
        L3:
            r2 = 0
            if (r3 == 0) goto L33
            com.squareup.wire.ProtoAdapter<X.0Zfd> r1 = X.C905470Zfd.ADAPTER     // Catch: java.lang.Throwable -> L16
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.decode(r0)     // Catch: java.lang.Throwable -> L16
            X.0Zfd r1 = (X.C905470Zfd) r1     // Catch: java.lang.Throwable -> L16
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L22:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L29
            r2 = r1
        L29:
            X.0Zfd r2 = (X.C905470Zfd) r2
            if (r2 == 0) goto L33
            X.0Zfm r1 = r2.newBuilder()
            if (r1 != 0) goto L38
        L33:
            X.0Zfm r1 = new X.0Zfm
            r1.<init>()
        L38:
            X.0ZGR r0 = X.C0ZGM.LIZ(r4)
            r1.LJIIL = r0
            X.0Zfd r0 = r1.build()
            X.0p3Z r2 = okio.ByteString.Companion
            byte[] r1 = r0.encode()
            int r0 = r1.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.getClass()
            okio.ByteString r0 = X.C1496910p3Z.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZDT.LJIIIZ(okio.ByteString, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData):okio.ByteString");
    }

    public static Map LIZ(List list, SessionInfo sessionInfo, C455010Hsp c455010Hsp) {
        boolean z;
        String inputAutoFilledSyncExt;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = true;
        if (c455010Hsp != null && !c455010Hsp.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (sessionInfo != null) {
                inputAutoFilledSyncExt = sessionInfo.getInputAutoFilledSyncExt();
            } else {
                inputAutoFilledSyncExt = null;
            }
            if (C123100dR.LIZ(inputAutoFilledSyncExt)) {
                if (sessionInfo == null || sessionInfo.getInputAutoFilledAweType() != 711) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        Map map = (Map) C051M.LIZ.LJIIIIZZ(sessionInfo.getInputAutoFilledSyncExt(), Map.class);
                        if (map != null) {
                            String str = (String) map.get("a:sq_id");
                            String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            linkedHashMap.put("a:sq_id", str);
                            String str3 = (String) map.get("a:sq_ver");
                            if (str3 == null) {
                                str3 = "";
                            }
                            linkedHashMap.put("a:sq_ver", str3);
                            String str4 = (String) map.get("a:set_by");
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put("a:set_by", str4);
                            String str5 = (String) map.get("a:landing_msg_type");
                            if (str5 != null) {
                                str2 = str5;
                            }
                            linkedHashMap.put("a:landing_msg_type", str2);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RichTextInfo) it2.next()).mentionedUid);
            }
            linkedHashMap.put("a:mentioned_uids", C13LP.LJJLIIIJ(C13LP.LLIIII(arrayList), ",", null, null, 0, null, null, 62));
        }
        return linkedHashMap;
    }

    public static Map LJFF(C869590Y9l c869590Y9l, String str, SessionInfo sessionInfo, C455010Hsp c455010Hsp, String str2) {
        String str3;
        String str4;
        C13DA c13da = new C13DA();
        ChatRoomEventTrackingStore chatRoomEventTrackingStore = ChatRoomEventTrackingStore.LIZIZ;
        String uuid = null;
        if (sessionInfo != null) {
            uuid = sessionInfo.getUuid();
        }
        c13da.putAll(chatRoomEventTrackingStore.LIZIZ(uuid));
        if (c869590Y9l != null && C0ZDX.LJJIZ(c869590Y9l)) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        c13da.put("quick_reply_message", str3);
        if (c869590Y9l != null && (str4 = c869590Y9l.getLocalExt().get("feed_video_status_flag")) != null) {
            c13da.put("feed_video_status_flag", str4);
        }
        if (C123100dR.LIZ(str)) {
            c13da.put("enter_method", str);
        }
        if (sessionInfo != null) {
            String entrancePageForMob = sessionInfo.getEntrancePageForMob();
            if (entrancePageForMob != null && C123100dR.LIZ(entrancePageForMob)) {
                c13da.put("entrance_page", entrancePageForMob);
            }
            String collabUserType = sessionInfo.getCollabUserType();
            if (collabUserType != null) {
                c13da.put("collab_user_type", collabUserType);
            }
        }
        if (c455010Hsp != null) {
            LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str5 = "1";
            linkedHashMap.put("is_auto_filled_content", "1");
            if (!c455010Hsp.LIZ) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_auto_filled_content_modified", str5);
            linkedHashMap.put("auto_filled_content_source", c455010Hsp.LIZIZ);
            c13da.putAll(linkedHashMap);
        }
        if (str2 != null) {
            c13da.put("pre_enter_from", str2);
        }
        return new LinkedHashMap(c13da.build());
    }

    public static TextContent LJ(C0ZDT c0zdt, CharSequence charSequence, List list, boolean z, FeatureAttachmentContent featureAttachmentContent, int i) {
        boolean z2;
        String string;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        FeatureAttachmentContent featureAttachmentContent2 = featureAttachmentContent;
        if ((i & 8) != 0) {
            featureAttachmentContent2 = null;
        }
        c0zdt.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list != null && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            RichTextInfo richTextInfo = (RichTextInfo) C13LP.LJJLIIIJJI(list);
            if (richTextInfo.position + richTextInfo.length >= charSequence.length()) {
                string = charSequence.toString();
            } else {
                String string2 = charSequence.toString();
                int length = string2.length() - 1;
                int i4 = 0;
                boolean z5 = false;
                while (i4 <= length) {
                    if (!z5) {
                        i3 = i4;
                    } else {
                        i3 = length;
                    }
                    if (Intrinsics.LJI(string2.charAt(i3), 32) <= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z5) {
                        if (!z4) {
                            z5 = true;
                        } else {
                            i4++;
                        }
                    } else {
                        if (!z4) {
                            break;
                        }
                        length--;
                    }
                }
                string = string2.subSequence(i4, length + 1).toString();
            }
        } else {
            String string3 = charSequence.toString();
            int length2 = string3.length() - 1;
            int i5 = 0;
            boolean z6 = false;
            while (i5 <= length2) {
                if (!z6) {
                    i2 = i5;
                } else {
                    i2 = length2;
                }
                if (Intrinsics.LJI(string3.charAt(i2), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z6) {
                    if (!z3) {
                        z6 = true;
                    } else {
                        i5++;
                    }
                } else {
                    if (!z3) {
                        break;
                    }
                    length2--;
                }
            }
            string = string3.subSequence(i5, length2 + 1).toString();
        }
        TextContent textContentObtain = TextContent.Companion.obtain(string, null, list, null, featureAttachmentContent2, null);
        textContentObtain.setSendStartTime(Long.valueOf(jCurrentTimeMillis));
        if (z) {
            textContentObtain.type = 703;
        }
        return textContentObtain;
    }
}
