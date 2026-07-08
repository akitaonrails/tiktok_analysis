package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.postmode.IMPostModeService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZT4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZT4 extends C09AY implements Function0<C895780ZCe> {
    public C0ZT4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZCe] */
    @Override // kotlin.jvm.functions.Function0
    public final C895780ZCe invoke() {
        return new C0Z2W() { // from class: X.0ZCe
            @Override // X.C0Z2W
            public final String LIZIZ() {
                return C1507405vE.LIZ();
            }

            @Override // X.C0Z2W
            public final boolean LIZJ(C869590Y9l c869590Y9l) {
                if (c869590Y9l.isRecalled() || c869590Y9l.getMsgType() == 15 || FakeMessageKt.isFakeMessage(c869590Y9l) || !C0ZDX.LJJIII(c869590Y9l)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
            
                return new X.C443120HZe<>(X.EnumC893180Z2e.THOUGHT, X.EnumC893160Z2c.REACTION, java.lang.Boolean.TRUE);
             */
            @Override // X.C0Z2W
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C443120HZe<X.EnumC893180Z2e, X.EnumC893160Z2c, java.lang.Boolean> LJFF(X.C869590Y9l r9) {
                /*
                    Method dump skipped, instruction units count: 427
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C895780ZCe.LJFF(X.0Y9l):X.0HZe");
            }

            @Override // X.C0Z2W
            public final String LIZ(Context context, C869590Y9l c869590Y9l) {
                return LJIIIIZZ(context.getResources(), c869590Y9l, BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class), new AwS558S0100000_14(c869590Y9l, 18));
            }

            @Override // X.C0Z2W
            public final String LJ(boolean z, Resources resources, C869590Y9l c869590Y9l) {
                PreviewHintComponent previewHintComponentYo;
                String str;
                int i;
                boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
                if (!z && C461060I6e.LIZIZ(c869590Y9l)) {
                    if (zLJJJJIZL) {
                        i = 2131849149;
                    } else {
                        i = 2131849148;
                    }
                    return resources.getString(i);
                }
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if (baseTemplateLIZ != null && (previewHintComponentYo = baseTemplateLIZ.yo()) != null) {
                    if (zLJJJJIZL) {
                        return previewHintComponentYo.senderPreviewText.text;
                    }
                    if (z) {
                        TextComponent textComponent = previewHintComponentYo.inAppPushPreviewText;
                        if (textComponent != null && (str = textComponent.text) != null) {
                            return str;
                        }
                        return previewHintComponentYo.receiverPreviewText.text;
                    }
                    return previewHintComponentYo.receiverPreviewText.text;
                }
                return "";
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.String LJIIIIZZ(android.content.res.Resources r6, X.C869590Y9l r7, com.ss.android.ugc.aweme.im.message.content.BaseContent r8, kotlin.jvm.functions.Function0 r9) {
                /*
                    Method dump skipped, instruction units count: 531
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C895780ZCe.LJIIIIZZ(android.content.res.Resources, X.0Y9l, com.ss.android.ugc.aweme.im.message.content.BaseContent, kotlin.jvm.functions.Function0):java.lang.String");
            }

            @Override // X.C0Z2W
            public final String LJI(Context context, C869590Y9l c869590Y9l, String str, BaseContent baseContent) {
                String string;
                if (!(baseContent instanceof TextContent)) {
                    return null;
                }
                TextContent textContent = (TextContent) baseContent;
                IIMAnonymousService iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpiForReal(IIMAnonymousService.class);
                String str2 = "";
                if (iIMAnonymousService != null) {
                    String conversationId = c869590Y9l.getConversationId();
                    String text = textContent.getText();
                    if (text == null) {
                        text = "";
                    }
                    CharSequence charSequenceLIZJ = iIMAnonymousService.LIZJ(conversationId, textContent, text);
                    if (charSequenceLIZJ != null && (string = charSequenceLIZJ.toString()) != null) {
                        str2 = string;
                    }
                }
                if (str != null) {
                    return context.getString(2131831607, str, str2);
                }
                return context.getString(2131831608, str2);
            }

            @Override // X.C0Z2W
            public final String LJII(Context context, C869590Y9l c869590Y9l, BaseContent baseContent, AwS558S0100000_14 awS558S0100000_14) {
                return LJIIIIZZ(context.getResources(), c869590Y9l, baseContent, awS558S0100000_14);
            }

            public static String LJIIIZ(Resources resources, ShareAwemeContent shareAwemeContent, boolean z, boolean z2, C869590Y9l c869590Y9l) {
                if (z || z2) {
                    IMPostModeService.LIZ.getClass();
                    IMPostModeService value = C895810ZCh.LIZIZ.getValue();
                    if (value != null && value.LIZIZ() && shareAwemeContent.type == 810) {
                        return resources.getString(2131828441);
                    }
                    if (z || z2) {
                        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                        if (companion.isVideoMention(c869590Y9l)) {
                            return resources.getString(2131831601);
                        }
                        if (companion.isVideoTag(c869590Y9l)) {
                            return resources.getString(2131831605);
                        }
                        if (companion.isVideoMentionAndTag(c869590Y9l)) {
                            return resources.getString(2131831603);
                        }
                        return resources.getString(2131828444);
                    }
                }
                IMPostModeService.LIZ.getClass();
                IMPostModeService value2 = C895810ZCh.LIZIZ.getValue();
                if (value2 != null && value2.LIZIZ() && shareAwemeContent.type == 810) {
                    return resources.getString(2131847327);
                }
                ShareAwemeContent.Companion companion2 = ShareAwemeContent.Companion;
                if (companion2.isVideoMention(c869590Y9l)) {
                    return resources.getString(2131831602);
                }
                if (companion2.isVideoTag(c869590Y9l)) {
                    return resources.getString(2131831606);
                }
                if (companion2.isVideoMentionAndTag(c869590Y9l)) {
                    return resources.getString(2131831604);
                }
                return resources.getString(2131847330);
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
            /* JADX WARN: Removed duplicated region for block: B:282:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:360:0x052a  */
            /* JADX WARN: Removed duplicated region for block: B:384:0x059d  */
            /* JADX WARN: Removed duplicated region for block: B:389:0x05a8  */
            @Override // X.C0Z2W
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.CharSequence LIZLLL(android.content.res.Resources r14, com.ss.android.ugc.aweme.im.message.content.BaseContent r15, boolean r16, boolean r17, java.lang.String r18, X.C869590Y9l r19, java.lang.String r20) {
                /*
                    Method dump skipped, instruction units count: 1606
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C895780ZCe.LIZLLL(android.content.res.Resources, com.ss.android.ugc.aweme.im.message.content.BaseContent, boolean, boolean, java.lang.String, X.0Y9l, java.lang.String):java.lang.CharSequence");
            }
        };
    }
}
