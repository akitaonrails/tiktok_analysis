package Y;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C19475311Hj;
import X.C20441214yg;
import X.C259800zU;
import X.C385090F7z;
import X.C480460Ism;
import X.C917840Zza;
import X.C953270auj;
import X.C953290aul;
import X.C953360aus;
import X.C953370aut;
import X.C953770avX;
import X.C954060aw0;
import X.C971050bNP;
import X.C971360bNu;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import X.InterfaceC500500Jk0;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.MultiGuestBoardTemplateOfficialConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multilive.model.LangTranslate;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateInfo;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateParams;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AkS199S0300000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.util.ArrayList] */
    public static final Object apply$0(AkS199S0300000_15 akS199S0300000_15, Object obj) {
        List<StarlingTranslateInfo> list;
        StarlingTranslateInfo next;
        String str;
        NLECommit head;
        String uuid;
        VecNLETrackSPtr tracks;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        List<LangTranslate> list2;
        LangTranslate langTranslate;
        StarlingTranslateResponse.ResponseData responseData;
        Pair pair = (Pair) obj;
        C953770avX c953770avX = (C953770avX) pair.getFirst();
        BaseResponse baseResponse = (BaseResponse) pair.getSecond();
        ((C971050bNP) akS199S0300000_15.l0).LIZ.LJLILLLLZI("step 2/5", "translating draftItem start", false);
        if (baseResponse != null && (responseData = (StarlingTranslateResponse.ResponseData) baseResponse.data) != null) {
            list = responseData.starlingTranslateInfo;
        } else {
            list = null;
        }
        ?? arrayList = new ArrayList();
        ((List) akS199S0300000_15.l1).add("official");
        C953770avX c953770avXLIZ = c953770avX.LIZ(3);
        if (c953770avXLIZ == null) {
            c953770avXLIZ = new C953770avX();
        }
        arrayList.add(c953770avXLIZ);
        if (list != null && !list.isEmpty()) {
            List<LangTranslate> list3 = ((StarlingTranslateInfo) ListProtector.get(list, 0)).langTranslate;
            List list4 = (List) akS199S0300000_15.l1;
            Iterator<LangTranslate> it2 = list3.iterator();
            while (it2.hasNext()) {
                list4.add(it2.next().locale);
                C953770avX c953770avXLIZ2 = c953770avX.LIZ(2);
                if (c953770avXLIZ2 == null) {
                    c953770avXLIZ2 = new C953770avX();
                }
                arrayList.add(c953770avXLIZ2);
            }
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C953770avX c953770avX2 = (C953770avX) obj2;
                    if (i != 0) {
                        int i3 = 0;
                        for (C971360bNu c971360bNu : c953770avX2.LJI) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                C971360bNu c971360bNu2 = c971360bNu;
                                Iterator<StarlingTranslateInfo> it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (Intrinsics.LJFF(next.starlingKey, c971360bNu2.LIZ)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                StarlingTranslateInfo starlingTranslateInfo = next;
                                String str2 = "";
                                if (starlingTranslateInfo == null || (list2 = starlingTranslateInfo.langTranslate) == null || (langTranslate = (LangTranslate) ListProtector.get(list2, i - 1)) == null || (str = langTranslate.translateResult) == null) {
                                    str = "";
                                }
                                NLEEditor nLEEditor = new NLEEditor();
                                nLEEditor.restore(c953770avX2.LJIIJ);
                                nLEEditor.commit();
                                nLEEditor.done();
                                NLEModel model = nLEEditor.getModel();
                                if (model != null && (tracks = model.getTracks()) != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (NLETrack nLETrack : tracks) {
                                        if (nLETrack.getExtraTrackType() == NLETrackType.STICKER) {
                                            arrayList2.add(nLETrack);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(((NLETrack) it4.next()).getSlots());
                                        if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                                            C385090F7z c385090F7z = NLETextRichContent.Companion;
                                            String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
                                            c385090F7z.getClass();
                                            if (Intrinsics.LJFF(C385090F7z.LIZ(richContent).richTextData.textStr, c971360bNu2.LIZ)) {
                                                MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                                                C971360bNu c971360bNu3 = new C971360bNu((String) null, 0, (String) null, 15);
                                                c971360bNu3.LIZ = str;
                                                c971360bNu3.LIZIZ = c971360bNu2.LIZIZ;
                                                c971360bNu3.LIZJ = c971360bNu2.LIZJ;
                                                multiCanvasUtils.getClass();
                                                MultiCanvasUtils.LJJ(c971360bNu3, nLESegmentTextStickerDynamicCast, nLEEditor);
                                            }
                                        } else {
                                            nLESegmentTextStickerDynamicCast = null;
                                        }
                                        arrayList3.add(nLESegmentTextStickerDynamicCast);
                                    }
                                }
                                nLEEditor.commit();
                                nLEEditor.done();
                                if (Intrinsics.LJFF(c953770avX2.LJIIIZ, ((C971360bNu) ListProtector.get(c953770avX2.LJI, i3)).LIZ)) {
                                    c953770avX2.LJIIIZ = str;
                                }
                                ((C971360bNu) ListProtector.get(c953770avX2.LJI, i3)).LIZ = str;
                                c953770avX2.LJIIJ = nLEEditor.store();
                                NLEBranch branch = nLEEditor.getBranch();
                                if (branch != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null) {
                                    str2 = uuid;
                                }
                                c953770avX2.LJII = str2;
                                C20441214yg.LIZIZ("starling_template", "step 2: generate translated DraftItems, index: " + i + ", text: " + str + ", mediaNodeId: " + c953770avX2.LJII);
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        ((C259800zU) akS199S0300000_15.l2).element = arrayList;
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS199S0300000_15 akS199S0300000_15, Object obj) {
        ((Function2) akS199S0300000_15.l0).invoke(Integer.valueOf(((IndexedValue) akS199S0300000_15.l1).LIZ + 1), Integer.valueOf(((List) akS199S0300000_15.l2).size()));
        return C953370aut.LIZJ((C917840Zza) ((IndexedValue) akS199S0300000_15.l1).LIZIZ);
    }

    public static final Object apply$2(AkS199S0300000_15 akS199S0300000_15, Object obj) {
        ((C954060aw0) akS199S0300000_15.l0).LIZ((Context) akS199S0300000_15.l1, "step 1/5", "get translated texts...", false);
        if (((List) akS199S0300000_15.l2).isEmpty()) {
            return AbstractC19484711Kz.LJIJJLI(new Pair(obj, null));
        }
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI(obj);
        C480460Ism.LIZ().getClass();
        IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
        StarlingTranslateParams starlingTranslateParams = new StarlingTranslateParams();
        List<String> list = (List) akS199S0300000_15.l2;
        starlingTranslateParams.useReqLocale = false;
        starlingTranslateParams.starlingKeyList = list;
        return C953290aul.LIZ(c19475311HjLJIJJLI, iMultiGuestPlayApi.starlingTranslate(starlingTranslateParams));
    }

    public static final Object apply$3(AkS199S0300000_15 akS199S0300000_15, Object obj) {
        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI((List) akS199S0300000_15.l0);
        long j = MultiGuestBoardTemplateOfficialConfigSetting.INSTANCE.getValue().tosMillSecondInternal;
        List list = (List) akS199S0300000_15.l0;
        return AbstractC19484711Kz.LJJJ(c19475311HjLJIJJLI, C11NZ.LJJJJIZL(C13LP.LLIIL(list)).LJIJ(new C953360aus(j, list, new AwS451S0200000_15((Context) akS199S0300000_15.l2, (C954060aw0) akS199S0300000_15.l1, 21))).LJLJLLL(), new InterfaceC500500Jk0<List<? extends C917840Zza>, List<? extends C953270auj>, R>() { // from class: X.0aw7
            @Override // X.InterfaceC500500Jk0
            public final R apply(List<? extends C917840Zza> list2, List<? extends C953270auj> list3) {
                return (R) new Pair(list2, list3);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final Object apply$4(AkS199S0300000_15 akS199S0300000_15, Object obj) {
        List list = (List) obj;
        ((C259800zU) akS199S0300000_15.l0).element = ListProtector.get(list, 0);
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avw
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Integer> interfaceC2329309At) {
                C11KT c11kt = (C11KT) interfaceC2329309At;
                C953370aut.LIZ(new AwS559S0100000_15(c11kt, 1102), new AwS594S0100000_15(c11kt, 1099));
            }
        }).LJJ(C11S5.LIZ()).LJIIZILJ(new AkS199S0300000_15((Context) akS199S0300000_15.l2, (C954060aw0) akS199S0300000_15.l1, list, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r3.LJIIJ((X.C953770avX) r7.l1) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$5(Y.AkS199S0300000_15 r7, java.lang.Object r8) {
        /*
            X.0avX r8 = (X.C953770avX) r8
            java.lang.Object r0 = r7.l0
            X.0bNO r0 = (X.C971040bNO) r0
            X.0auS r0 = r0.LJI
            r4 = 0
            if (r0 == 0) goto L96
            X.0Zxp r0 = r0.LIZLLL
            if (r0 == 0) goto L96
            java.lang.String r1 = r0.LIZJ
        L11:
            java.lang.Object r0 = r7.l1
            X.0avX r0 = (X.C953770avX) r0
            java.lang.String r0 = r0.LJII
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r5 = -1
            if (r0 != 0) goto L99
            java.lang.Object r3 = r7.l0
            X.0bNO r3 = (X.C971040bNO) r3
            X.0auS r2 = r3.LJI
            if (r2 == 0) goto L94
            X.0au7 r1 = r2.LIZJ
        L29:
            X.0au7 r0 = X.EnumC952890au7.PLAYBOOK
            if (r1 == r0) goto L3f
            if (r2 == 0) goto L92
            X.0au7 r1 = r2.LIZJ
        L31:
            X.0au7 r0 = X.EnumC952890au7.PREVIEW_PLAYBOOK
            if (r1 == r0) goto L3f
            java.lang.Object r0 = r7.l1
            X.0avX r0 = (X.C953770avX) r0
            boolean r0 = r3.LJIIJ(r0)
            if (r0 == 0) goto L99
        L3f:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager.LIZ
            java.lang.Object r0 = r7.l2
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = (com.bytedance.ies.nle.editor_jni.NLEEditor) r0
            X.11Jy r3 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager.LJIIIIZZ(r0, r8)
            X.11Hj r4 = X.AbstractC19484711Kz.LJIJJLI(r8)
            java.lang.Object r1 = r7.l0
            X.0bNO r1 = (X.C971040bNO) r1
            java.lang.Object r0 = r7.l1
            X.0avX r0 = (X.C953770avX) r0
            boolean r0 = r1.LJIIJ(r0)
            if (r0 == 0) goto L79
            java.lang.Object r1 = r7.l0
            X.0bNO r1 = (X.C971040bNO) r1
            java.lang.Object r0 = r7.l1
            X.0avX r0 = (X.C953770avX) r0
            r1.getClass()
            java.lang.Long r0 = r0.LJIIL
            if (r0 == 0) goto L88
            X.0auf r2 = X.C953230auf.LIZ
            long r0 = r0.longValue()
            r2.getClass()
            boolean r0 = X.C953230auf.LJIIL(r0)
            if (r0 == 0) goto L88
        L79:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            X.11Hj r1 = X.AbstractC19484711Kz.LJIJJLI(r0)
        L81:
            X.0auH r0 = X.C952990auH.LIZ
            X.11Kz r0 = X.AbstractC19484711Kz.LJJIZ(r3, r4, r1, r0)
            return r0
        L88:
            X.0auf r0 = X.C953230auf.LIZ
            r0.getClass()
            X.11Jy r1 = X.C953230auf.LJ()
            goto L81
        L92:
            r1 = r4
            goto L31
        L94:
            r1 = r4
            goto L29
        L96:
            r1 = r4
            goto L11
        L99:
            X.0HZe r1 = new X.0HZe
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.<init>(r4, r8, r0)
            X.11Hj r0 = X.AbstractC19484711Kz.LJIJJLI(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS199S0300000_15.apply$5(Y.AkS199S0300000_15, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS199S0300000_15(android.content.Context r2, X.C954060aw0 r3, java.util.List r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS199S0300000_15.<init>(android.content.Context, X.0aw0, java.util.List, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS199S0300000_15(Object obj, C971050bNP c971050bNP, List<String> list, C259800zU<List<C953770avX>> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = c971050bNP;
        this.l2 = list;
    }
}
