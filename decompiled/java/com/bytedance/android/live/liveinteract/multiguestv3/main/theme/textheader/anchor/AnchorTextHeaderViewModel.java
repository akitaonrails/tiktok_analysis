package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.AbstractC19484711Kz;
import X.C00UM;
import X.C01F5;
import X.C01GW;
import X.C01JX;
import X.C01NB;
import X.C01ZA;
import X.C09JN;
import X.C0UO0;
import X.C1161920gLG;
import X.C13BV;
import X.C1516000pYM;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C300201Ei;
import X.C452501pT;
import X.C480460Ism;
import X.C515801zg;
import X.C516201zk;
import X.C5182020e;
import X.C5183020f;
import X.C972080bP4;
import X.InterfaceC300801Eo;
import Y.AObserverS219S0100000_15;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestMemoryInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api.ITextHeaderApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordDeleteParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordDeleteResponse;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.TextHeaderMaterialInfo;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: loaded from: classes.dex */
public class AnchorTextHeaderViewModel extends BaseTextHeaderViewModel {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final MutableLiveData<List<C01ZA>> LLJILJIL;
    public final MutableLiveData<List<C00UM>> LLJILJILJ;
    public final MutableLiveData<List<TextHeaderBoardTextFontStyleData>> LLJILLL;
    public final MutableLiveData<C01F5> LLJJ;
    public final MutableLiveData LLJJI;
    public final C01GW LLJJIII;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final String AQ2() {
        return "AnchorTextHeaderViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    /* JADX INFO: renamed from: LQ2, reason: merged with bridge method [inline-methods] */
    public final C300201Ei wQ2() {
        return (C300201Ei) this.LLJJIII.getValue();
    }

    public final long MQ2() {
        Long value = this.LLIZ.getValue();
        if (value != null) {
            return value.longValue();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final void onInit() {
        GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo;
        super.onInit();
        this.LLILZ.observeForever(new AObserverS219S0100000_15(this, 20));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestMemoryInfoChannel.class, this, new C5183020f(this, 69));
        }
        DataChannel dataChannel2 = this.LL;
        HQ2((dataChannel2 == null || (memoryInfo = (GetMemoryInfoResponse.ResponseData.MemoryInfo) dataChannel2.gg0(MultiGuestMemoryInfoChannel.class)) == null) ? null : memoryInfo.textHeader, "TextHeaderMemoryInfoChannelInit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTextHeaderViewModel(DataChannel dataChannel) {
        AbstractC19484711Kz abstractC19484711KzLJIILLIIL;
        C01F5 c01f5;
        super(dataChannel);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJILJIL = new MutableLiveData<>(c13bv);
        this.LLJILJILJ = new MutableLiveData<>(c13bv);
        this.LLJILLL = new MutableLiveData<>(null);
        MutableLiveData<C01F5> mutableLiveData = new MutableLiveData<>(new C01F5(null, null, 0, false, 0.0f, false, 255));
        this.LLJJ = mutableLiveData;
        this.LLJJI = mutableLiveData;
        this.LLJJIII = C452501pT.LIZIZ(new C5182020e(dataChannel, 69));
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        if (iHostCreativeTool != null && iHostCreativeTool.ni()) {
            abstractC19484711KzLJIILLIIL = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01eP
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<List<TextHeaderBoardTextFontStyleData>> interfaceC2329309At) {
                    InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                    if (interfaceC397701gdYn2 != null) {
                        interfaceC397701gdYn2.LJIILJJIL("text_header", true, new C513201zG((C11KT) interfaceC2329309At, 1));
                    }
                }
            }).LJFF(new C0UO0());
        } else {
            abstractC19484711KzLJIILLIIL = AbstractC19484711Kz.LJIILLIIL(new Throwable("prefetchV2 return as isVEPluginInstalled is false"));
        }
        C19487311Lz.LIZJ(abstractC19484711KzLJIILLIIL, vQ2(), new C516201zk(this, 60), new C516201zk(this, 61), 24);
        if (dataChannel != null) {
            C01ZA c01za = (C01ZA) this.LLILZ.getValue();
            dataChannel.zW(TextHeaderUsingRichTextChangeChannel.class, (c01za == null || (c01f5 = c01za.LIZ) == null) ? C01F5.LJIIIIZZ : c01f5);
        }
    }

    public final void NQ2(String str) {
        C20441214yg.LIZIZ("AnchorTextHeaderViewModel", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void HQ2(TextHeaderPlayContent textHeaderPlayContent, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consumeMemoryTextHeader source:");
        sbLIZ.append(str);
        sbLIZ.append(" playContent:");
        String strLIZLLL = null;
        if (textHeaderPlayContent != null) {
            numValueOf = Integer.valueOf(textHeaderPlayContent.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" current:");
        TextHeaderPlayContent textHeaderPlayContent2 = wQ2().LIZIZ;
        if (textHeaderPlayContent2 != null) {
            numValueOf2 = Integer.valueOf(textHeaderPlayContent2.hashCode());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" running:");
        C01ZA c01za = (C01ZA) this.LLILZ.getValue();
        if (c01za != null) {
            numValueOf3 = Integer.valueOf(c01za.hashCode());
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(numValueOf3);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderViewModel", 2);
        if (textHeaderPlayContent != null && wQ2().LIZIZ == null && this.LLILZ.getValue() == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("consumeMemoryTextHeader playContent:");
            if (textHeaderPlayContent != null) {
                strLIZLLL = C1516000pYM.LIZLLL(textHeaderPlayContent);
            }
            sbLIZ2.append(strLIZLLL);
            C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "AnchorTextHeaderViewModel", 2);
            C300201Ei c300201EiWQ2 = wQ2();
            c300201EiWQ2.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateContentFromResume source:");
            sbLIZ3.append("memory");
            C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3), "AnchorTextHeaderModel", 2);
            c300201EiWQ2.LJII(textHeaderPlayContent, "memory");
            return;
        }
        C972080bP4.LIZLLL("consumeMemoryTextHeader return as shouldApplyMemoryTextHeader is false", "AnchorTextHeaderViewModel", 2);
    }

    public final void KQ2(Function0<Unit> function0, Function0<Unit> function02) {
        if (MQ2() > 0) {
            C300201Ei c300201EiWQ2 = wQ2();
            TextHeaderEndParams textHeaderEndParams = new TextHeaderEndParams();
            textHeaderEndParams.roomId = C01JX.LJII();
            textHeaderEndParams.textHeaderId = MQ2();
            c300201EiWQ2.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).endPlay(textHeaderEndParams), "AnchorTextHeaderModel", "endPlay").LJIILL(new C516201zk(c300201EiWQ2, 66))).LJFF(new C0UO0()), vQ2(), new C515801zg(function0, function02, 16), new C516201zk(function02, 63), 24);
            return;
        }
        NQ2("endPlay return as textHeaderId is valid");
        function02.invoke();
    }

    public final void JQ2(final long j, final Function0 function0, final Function1 function1) {
        if (j > 0) {
            C300201Ei c300201EiWQ2 = wQ2();
            TextHeaderRecordDeleteParams textHeaderRecordDeleteParams = new TextHeaderRecordDeleteParams();
            textHeaderRecordDeleteParams.roomId = C01JX.LJII();
            textHeaderRecordDeleteParams.recordId = j;
            c300201EiWQ2.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).deleteRecord(textHeaderRecordDeleteParams), "AnchorTextHeaderModel", "deleteRecord").LJIILL(new C09JN() { // from class: X.00SK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AnchorTextHeaderModel@c2b9.deleteRecord$1");
                    C930480aJy.LIZ.getClass();
                    C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.deleteRecord$1");
                }
            })).LJFF(new C0UO0()), vQ2(), new C09JN() { // from class: X.00SW
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MutableLiveData<java.util.List<X.01ZA>>] */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
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
                @Override // X.C09JN
                public final void accept(Object obj) {
                    ?? arrayList;
                    Integer numValueOf;
                    C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.deleteRecord$2");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI(c470590Icr)) {
                        List<C01ZA> value = this.LL.LLJILJIL.getValue();
                        if (value != null) {
                            long j2 = j;
                            arrayList = new ArrayList();
                            for (C01ZA c01za : value) {
                                if (c01za.LIZLLL != j2) {
                                    arrayList.add(c01za);
                                }
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("beforeDelete list.size:");
                        List<C01ZA> value2 = this.LL.LLJILJIL.getValue();
                        if (value2 != null) {
                            numValueOf = Integer.valueOf(value2.size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(" after:");
                        sbLIZ.append(arrayList.size());
                        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderViewModel", 2);
                        this.LL.LLJILJIL.setValue(arrayList);
                        Function1<TextHeaderRecordDeleteResponse.ResponseData, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(c470590Icr.data);
                        }
                    } else {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                    C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.deleteRecord$2");
                }
            }, new C516201zk(function0, 64), 24);
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void IQ2(C01F5 c01f5, Integer num, Function1<? super TextHeaderRecordCreateResponse.ResponseData, Unit> function1, Function0<Unit> function0, String str, int i) {
        C300201Ei c300201EiWQ2 = wQ2();
        TextHeaderRecordCreateParams textHeaderRecordCreateParams = new TextHeaderRecordCreateParams();
        textHeaderRecordCreateParams.roomId = C01JX.LJII();
        textHeaderRecordCreateParams.fromMediaNodeId = str;
        TextHeaderMaterialInfo textHeaderMaterialInfo = new TextHeaderMaterialInfo();
        textHeaderMaterialInfo.text = c01f5.LIZ;
        textHeaderMaterialInfo.fontName = c01f5.LIZIZ;
        textHeaderMaterialInfo.stroke = c01f5.LIZLLL ? 1 : 0;
        textHeaderMaterialInfo.color = c01f5.LIZJ;
        textHeaderRecordCreateParams.textHeaderMaterialInfo = textHeaderMaterialInfo;
        textHeaderRecordCreateParams.autoStartMode = i;
        if (num != null) {
            textHeaderRecordCreateParams.sourceFrom = num.intValue();
        }
        c300201EiWQ2.getClass();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).createRecord(textHeaderRecordCreateParams), "AnchorTextHeaderModel", "createRecord").LJIILL(new C09JN() { // from class: X.00SJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AnchorTextHeaderModel@c2b9.createRecord$1");
                C930480aJy.LIZ.getClass();
                C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.createRecord$1");
            }
        })).LJFF(new C0UO0()), vQ2(), new C515801zg(function1, function0, 15), new C516201zk(function0, 62), 24);
    }
}
