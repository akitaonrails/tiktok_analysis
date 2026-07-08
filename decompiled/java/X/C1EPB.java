package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tools.service.AiChatFeatureServiceImpl;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EPB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EPB extends C09AY implements Function0<C21291118Tt> {
    public final /* synthetic */ AiChatFeatureServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EPB(AiChatFeatureServiceImpl aiChatFeatureServiceImpl) {
        super(0);
        this.LL = aiChatFeatureServiceImpl;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.18Tt] */
    @Override // kotlin.jvm.functions.Function0
    public final C21291118Tt invoke() {
        if (this.LL.LIZIZ().LIZ()) {
            return new InterfaceC876790YaT() { // from class: X.18Tt
                @Override // X.InterfaceC876790YaT
                public final String LJ() {
                    return C21291518Tx.LJ(EnumC21291418Tw.PUSH_COMPLETE_DESC, new Object[0]);
                }

                @Override // X.InterfaceC876790YaT
                public final UrlModel LJFF() {
                    String str = C21288518St.LIZ().aiChatAvatar;
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(Collections.singletonList(str));
                    return urlModel;
                }

                @Override // X.InterfaceC876790YaT
                public final String LIZ(C869590Y9l c869590Y9l) {
                    if (C21289818Tg.LIZJ(c869590Y9l)) {
                        return C21291518Tx.LJ(EnumC21291418Tw.PUSH_COMPLETE_TITLE, new Object[0]);
                    }
                    return C21291518Tx.LJ(EnumC21291418Tw.PUSH_FAIL_TITLE, new Object[0]);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
                @Override // X.InterfaceC876790YaT
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZIZ(X.C869590Y9l r7) {
                    /*
                        r6 = this;
                        int r1 = r7.getMsgType()
                        r2 = 0
                        r0 = 1821(0x71d, float:2.552E-42)
                        java.lang.String r5 = "business_type"
                        java.lang.String r4 = "4"
                        r3 = 0
                        if (r1 != r0) goto L27
                        java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate.class
                        com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r7, r0)
                        com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate) r0
                        if (r0 == 0) goto L20
                        java.util.Map<java.lang.String, java.lang.String> r0 = r0.extra
                        if (r0 == 0) goto L20
                        java.lang.Object r3 = r0.get(r5)
                    L20:
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
                    L24:
                        if (r0 == 0) goto L46
                        return r2
                    L27:
                        int r1 = r7.getMsgType()
                        r0 = 1820(0x71c, float:2.55E-42)
                        if (r1 != r0) goto L46
                        java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate.class
                        com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r7, r0)
                        com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate) r0
                        if (r0 == 0) goto L41
                        java.util.Map<java.lang.String, java.lang.String> r0 = r0.extra
                        if (r0 == 0) goto L41
                        java.lang.Object r3 = r0.get(r5)
                    L41:
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
                        goto L24
                    L46:
                        boolean r0 = X.C21289818Tg.LIZJ(r7)
                        r1 = 1
                        if (r0 != 0) goto L69
                        X.18Ts r0 = X.C21290118Tj.LIZ(r7)
                        if (r0 == 0) goto L5d
                        X.18Ts r0 = X.C21290118Tj.LIZ(r7)
                        if (r0 == 0) goto L69
                        boolean r0 = r0.LIZJ
                        if (r0 != r1) goto L69
                    L5d:
                        X.18TL r0 = X.C21290118Tj.LIZIZ(r7)
                        if (r0 != 0) goto L69
                        boolean r0 = X.C21289818Tg.LJFF(r7)
                        if (r0 == 0) goto L80
                    L69:
                        r2 = 1
                        java.util.Map r0 = r7.getExt()
                        java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                        r1.<init>(r0)
                        java.lang.String r0 = "a:disable_outer_push"
                        r1.remove(r0)
                        java.lang.String r0 = "a:disable_inner_push"
                        r1.remove(r0)
                        r7.setExt(r1)
                    L80:
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "shouldShowPush: "
                        r1.append(r0)
                        r1.append(r2)
                        java.lang.String r0 = " for msgType: "
                        r1.append(r0)
                        int r0 = r7.getMsgType()
                        r1.append(r0)
                        java.lang.String r0 = " scene: "
                        r1.append(r0)
                        java.lang.String r0 = r7.getScene()
                        r1.append(r0)
                        java.lang.String r0 = " ext: "
                        r1.append(r0)
                        java.util.Map r0 = r7.getExt()
                        r1.append(r0)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "AiChatPushServiceImpl"
                        X.C21290818Tq.LIZ(r0, r1)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21291118Tt.LIZIZ(X.0Y9l):boolean");
                }

                @Override // X.InterfaceC876790YaT
                public final boolean LIZJ(C869590Y9l c869590Y9l) {
                    return C21289818Tg.LJ(c869590Y9l);
                }

                @Override // X.InterfaceC876790YaT
                public final String LIZLLL(C869590Y9l c869590Y9l) {
                    if (C21289818Tg.LIZJ(c869590Y9l)) {
                        return "inner_visual_poet_success";
                    }
                    if (C21290118Tj.LIZ(c869590Y9l) == null && C21290118Tj.LIZIZ(c869590Y9l) == null && !C21289818Tg.LJFF(c869590Y9l)) {
                        return "inner_visual_poet_other";
                    }
                    return "inner_visual_poet_fail";
                }
            };
        }
        return null;
    }
}
