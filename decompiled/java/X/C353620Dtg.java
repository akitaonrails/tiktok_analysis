package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.aisticker.SingleAIStickerItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.phototemplate.StickerDownloadHelper$downloadStickerIconForTemplate$1", f = "StickerDownloadHelper.kt", l = {64}, m = "invokeSuspend")
public final class C353620Dtg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NLETemplateModel LLILLL;
    public final /* synthetic */ ArrayList<AnonymousClass0957<Object>> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Set<String> LLILZLL;
    public final /* synthetic */ ShortVideoContext LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353620Dtg(NLETemplateModel nLETemplateModel, ArrayList<AnonymousClass0957<Object>> arrayList, Function0<Unit> function0, Set<String> set, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C353620Dtg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = nLETemplateModel;
        this.LLILZ = arrayList;
        this.LLILZIL = function0;
        this.LLILZLL = set;
        this.LLIZ = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353620Dtg c353620Dtg = new C353620Dtg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c353620Dtg.LLILLJJLI = obj;
        return c353620Dtg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLESegment mainSegment;
        NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast;
        NLEResourceNode effectSDKFile;
        String first;
        String second;
        C1C7U.LIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            VecNLETrackSPtr tracks = this.LLILLL.getTracks();
            Set<String> set = this.LLILZLL;
            ArrayList<AnonymousClass0957<Object>> arrayList = this.LLILZ;
            ShortVideoContext shortVideoContext = this.LLIZ;
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                    if (nLETrackSlot != null) {
                        mainSegment = nLETrackSlot.getMainSegment();
                    } else {
                        mainSegment = null;
                    }
                    if (NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment) != null && (nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment)) != null && (effectSDKFile = nLESegmentInfoStickerDynamicCast.getEffectSDKFile()) != null) {
                        Pair<String, String> pairLIZJ = C0FGD.LIZJ(effectSDKFile.getResourceId());
                        C0LE8.LIZ.getClass();
                        C389400FOo c389400FOo = C0LE8.LJFF;
                        if (pairLIZJ != null) {
                            first = pairLIZJ.getFirst();
                            second = pairLIZJ.getSecond();
                        } else {
                            first = null;
                            second = null;
                        }
                        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
                        if (effectLIZIZ != null && !set.contains(effectSDKFile.getResourceId())) {
                            set.add(effectSDKFile.getResourceId());
                            if (C123100dR.LIZ((String) C13LP.LJJJLL(effectLIZIZ.getIconUrl().getUrlList())) && C1462570oAB.LIZ(effectLIZIZ)) {
                                C585350MxZ c585350MxZ = SingleAIStickerItem.Companion;
                                String effectId = effectLIZIZ.getEffectId();
                                String str = (String) C13LP.LJJJLL(effectLIZIZ.getIconUrl().getUrlList());
                                if (str == null) {
                                    str = "";
                                }
                                c585350MxZ.getClass();
                                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C353630Dth(shortVideoContext, C585350MxZ.LIZ(effectId, str), pairLIZJ, effectLIZIZ, null), 2));
                            }
                        }
                    }
                }
            }
            ArrayList<AnonymousClass0957<Object>> arrayList2 = this.LLILZ;
            this.LL = 1;
            if (C1D9F.LIZ(arrayList2, this) == objLJFF) {
                C1C7U.LIZIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1");
                return objLJFF;
            }
        }
        this.LLILZIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerDownloadHelper@f9e8.downloadStickerIconForTemplate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
