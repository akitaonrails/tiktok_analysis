package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.1DUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.VideoMsgSender$retrySendMessage$1", f = "VideoMsgSender.kt", l = {}, m = "invokeSuspend")
public final class C1DUZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ C0Y3I LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DUZ(C869590Y9l c869590Y9l, C0Y3I c0y3i, InterfaceC1364105Vn<? super C1DUZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = c0y3i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1DUZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YC6 next;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        C0YHX c0yhxLIZ2;
        C0YOZ c0yozLJFF2;
        C0YC6 next2;
        boolean z;
        C1777570wMF c1777570wMF;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C0YHX c0yhxLIZ3;
        C0YOZ c0yozLJFF3;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        String str;
        C0YC6 next3;
        C1C7U.LIZ("VideoMsgSender@8bf3.retrySendMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC1446110njd enumC1446110njd = EnumC1446110njd.VIDEO;
        String uuid = this.LL.getUuid();
        List<C0YC6> attachments = this.LL.getAttachments();
        Long lLJFF = null;
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next3 = it2.next();
                    if (next3.index == 0) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            C0YC6 c0yc6 = next3;
            if (c0yc6 != null) {
                lLJFF = C2286608xc.LJFF(c0yc6.getOriginalDuration());
            }
        }
        final C2256701DUm c2256701DUm = new C2256701DUm(jCurrentTimeMillis, false, false, enumC1446110njd, 0, true, uuid, false, lLJFF, this.LL.getLocalExt().get("enter_method"), 296);
        List<C0YC6> attachments2 = this.LL.getAttachments();
        if (attachments2 != null) {
            Iterator<C0YC6> it3 = attachments2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next.index == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc62 = next;
            if (c0yc62 != null) {
                C869590Y9l c869590Y9l = this.LL;
                C0Y3I c0y3i = this.LLILLJJLI;
                C2256581DUa c2256581DUa = C2256581DUa.LIZ;
                c2256581DUa.getClass();
                int uploadState = c0yc62.getUploadState();
                if (uploadState == EnumC2249741D3s.UPLOADED.getState()) {
                    List<C0YC6> attachments3 = c869590Y9l.getAttachments();
                    if (attachments3 != null) {
                        Iterator<C0YC6> it4 = attachments3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                if (next2.index == 2) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        C0YC6 c0yc63 = next2;
                        if (c0yc63 != null && c0yc63.getVid() != null) {
                            c0yc63.getOriginalWidth();
                            c0yc63.getOriginalHeight();
                            if (c869590Y9l.getMsgType() == 1818) {
                                z = true;
                            } else {
                                z = false;
                            }
                            BaseTemplate baseTemplateLIZJ = C2241931Cox.LIZJ(c869590Y9l, BaseTemplate.class);
                            if (baseTemplateLIZJ != null && (baseRequestComponentRj = baseTemplateLIZJ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (str = queryDataComponent.extras.get("effect_game_id")) != null && C123100dR.LIZ(str)) {
                                String str2 = queryDataComponent.extras.get("effect_game_name");
                                String str3 = "";
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str4 = queryDataComponent.extras.get("effect_game_icon_url");
                                if (str4 != null) {
                                    str3 = str4;
                                }
                                c1777570wMF = new C1777570wMF(str, str2, str3);
                            } else {
                                c1777570wMF = null;
                            }
                            C2256581DUa c2256581DUa2 = C2256581DUa.LIZ;
                            String str5 = c869590Y9l.getExt().get("effect_id");
                            String str6 = c869590Y9l.getExt().get("remix_item_ids");
                            boolean zLJFF = Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_dm_text_icon"), "1");
                            boolean zLJFF2 = Intrinsics.LJFF(c869590Y9l.getLocalExt().get("has_text"), "1");
                            boolean zLJFF3 = Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_highlight_video"), "1");
                            ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
                            C2241941Coy c2241941CoyDecode = protoAdapter.decode(c869590Y9l.getContentPB());
                            if (c2241941CoyDecode != null && (c2242771CqJ = c2241941CoyDecode.attachment) != null) {
                                attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
                            } else {
                                attachmentComponentLIZ = null;
                            }
                            C2241941Coy c2241941CoyDecode2 = protoAdapter.decode(c869590Y9l.getContentPB());
                            if (c2241941CoyDecode2 != null && (c2242321Cpa = c2241941CoyDecode2.header) != null) {
                                baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
                            } else {
                                baseHeaderComponentLIZIZ = null;
                            }
                            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
                            c2256581DUa2.getClass();
                            c869590Y9l.setContentPB(C2256581DUa.LIZ(str5, str6, zLJFF, zLJFF2, attachmentComponentLIZ, zLJFF3, z, referenceInfo, baseHeaderComponentLIZIZ, c1777570wMF).encode());
                            if (C455040Hss.LIZ()) {
                                C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                                IIMCoreProxyService.LIZ.getClass();
                                IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                                if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ3 = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF3 = c0yhxLIZ3.LJFF()) != null) {
                                    c0yozLJFF3.LIZ(new C873450YOh(c869590Y9l.getUuid(), null, c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DVk
                                        @Override // X.C0YOY
                                        public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                            if (interfaceC873750YPl instanceof C0YPL) {
                                                C2256581DUa.LIZIZ.invoke(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), ((C0YPL) interfaceC873750YPl).LIZIZ);
                                            } else {
                                                if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                                    return;
                                                }
                                                C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                                C2256581DUa.LIZJ.invoke(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_from_uploaded_sdk_fail");
                                            }
                                        }
                                    });
                                } else {
                                    C2256581DUa.LIZJ.invoke(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), null, null, "retry_uploaded_abort");
                                }
                            } else {
                                C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), (List) null, new C0YOY() { // from class: X.1DVl
                                    @Override // X.C0YOY
                                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                        if (interfaceC873750YPl instanceof C0YPL) {
                                            C2256581DUa.LIZIZ.invoke(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), ((C0YPL) interfaceC873750YPl).LIZIZ);
                                        } else {
                                            if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                                return;
                                            }
                                            C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                            C2256581DUa.LIZJ.invoke(C2256701DUm.LIZ(c2256701DUm, EnumC2249731D3r.UPLOADED, null, false, 2039), c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_from_uploaded_sdk_fail");
                                        }
                                    }
                                }, c0y3i.LIZ(), false, 38));
                            }
                        }
                    }
                } else if (uploadState == EnumC2249741D3s.SYNTHESISED.getState()) {
                    if (C455040Hss.LIZ()) {
                        C0YM2 c0ym22 = C0YM2.TIKTOK_SOCIAL_IM;
                        IIMCoreProxyService.LIZ.getClass();
                        IIMCoreProxyService iIMCoreProxyServiceLIZ2 = C875420YVw.LIZ();
                        if (iIMCoreProxyServiceLIZ2 != null && (c0yhxLIZ2 = iIMCoreProxyServiceLIZ2.LIZ(c0ym22)) != null && (c0yozLJFF2 = c0yhxLIZ2.LJFF()) != null) {
                            c0yozLJFF2.LIZ(new C873450YOh(c869590Y9l.getUuid(), C1697810uHb.LJIIJJI(new C874390YRx(), new C2256601DUc(c869590Y9l, c0yc62, c2256701DUm, c0y3i.LIZ(), new C1DV3(new C1DVQ(c2256581DUa), new C1DVE(c2256581DUa), new C1DV2(c2256581DUa), new C2256861DVc(c2256581DUa)), true), new C0YS0()), c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DVw
                                @Override // X.C0YOY
                                public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    if (interfaceC873750YPl instanceof C0YPL) {
                                        C2256581DUa.LIZIZ.invoke(c2256701DUm, ((C0YPL) interfaceC873750YPl).LIZIZ);
                                    } else {
                                        if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                            return;
                                        }
                                        C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                        C2256581DUa.LIZJ.invoke(c2256701DUm, c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_from_synthesised_sdk_fail");
                                    }
                                }
                            });
                        } else {
                            C2256581DUa.LIZJ.invoke(c2256701DUm, null, null, "message_manager_unavail");
                        }
                    } else {
                        C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), C1697810uHb.LJIIJJI(new C874390YRx(), new C2256601DUc(c869590Y9l, c0yc62, c2256701DUm, c0y3i.LIZ(), new C1DV3(new C1DVR(c2256581DUa), new C1DVF(c2256581DUa), new C2256821DUy(c2256581DUa), new C1DVU(c2256581DUa)), true), new C0YS0()), new C0YOY() { // from class: X.1DVp
                            @Override // X.C0YOY
                            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                if (interfaceC873750YPl instanceof C0YPL) {
                                    C2256581DUa.LIZIZ.invoke(c2256701DUm, ((C0YPL) interfaceC873750YPl).LIZIZ);
                                } else {
                                    if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                        return;
                                    }
                                    C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                    C2256581DUa.LIZJ.invoke(c2256701DUm, c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_from_synthesised_sdk_fail");
                                }
                            }
                        }, c0y3i.LIZ(), false, 36));
                    }
                } else if (C455040Hss.LIZ()) {
                    C0YM2 c0ym23 = C0YM2.TIKTOK_SOCIAL_IM;
                    IIMCoreProxyService.LIZ.getClass();
                    IIMCoreProxyService iIMCoreProxyServiceLIZ3 = C875420YVw.LIZ();
                    if (iIMCoreProxyServiceLIZ3 != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ3.LIZ(c0ym23)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                        c0yozLJFF.LIZ(new C873450YOh(c869590Y9l.getUuid(), C1697810uHb.LJIIJJI(new C874390YRx(), new C2256601DUc(c869590Y9l, c0yc62, c2256701DUm, c0y3i.LIZ(), new C1DV3(new C1DVN(c2256581DUa), new C1DVC(c2256581DUa), new C1DV0(c2256581DUa), new C1DVX(c2256581DUa))), new C0YS0()), c0y3i.LIZ()), new C0IC5(null, 3), new C0YOY() { // from class: X.1DVx
                            @Override // X.C0YOY
                            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                if (interfaceC873750YPl instanceof C0YPL) {
                                    C2256581DUa.LIZIZ.invoke(c2256701DUm, ((C0YPL) interfaceC873750YPl).LIZIZ);
                                } else {
                                    if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                        return;
                                    }
                                    C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                    C2256581DUa.LIZJ.invoke(c2256701DUm, c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_other_sdk_fail");
                                }
                            }
                        });
                    } else {
                        C2256581DUa.LIZJ.invoke(c2256701DUm, null, null, "message_manager_unavail");
                    }
                } else {
                    C882760Yk6.LIZ(C882760Yk6.LIZ).LIZJ(new C873500YOm((C0YHT) new C0YPU(c869590Y9l), C1697810uHb.LJIIJJI(new C874390YRx(), new C2256601DUc(c869590Y9l, c0yc62, c2256701DUm, c0y3i.LIZ(), new C1DV3(new C1DVO(c2256581DUa), new C1DVD(c2256581DUa), new C1DV1(c2256581DUa), new C2256851DVb(c2256581DUa))), new C0YS0()), new C0YOY() { // from class: X.1DVy
                        @Override // X.C0YOY
                        public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                            if (interfaceC873750YPl instanceof C0YPL) {
                                C2256581DUa.LIZIZ.invoke(c2256701DUm, ((C0YPL) interfaceC873750YPl).LIZIZ);
                            } else {
                                if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                    return;
                                }
                                C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                                C2256581DUa.LIZJ.invoke(c2256701DUm, c0yq0.LIZJ.toIMError(), c0yq0.LIZIZ, "retry_other_sdk_fail");
                            }
                        }
                    }, c0y3i.LIZ(), false, 36));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMsgSender@8bf3.retrySendMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
