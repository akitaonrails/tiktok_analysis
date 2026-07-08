package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel$submitTranslatedCaptions$1$response$1", f = "NewCreatorCaptionEditViewModel.kt", l = {200}, m = "invokeSuspend")
public final class C480301tx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ NewCreatorCaptionEditItem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C480301tx(long j, long j2, String str, NewCreatorCaptionEditItem newCreatorCaptionEditItem, InterfaceC1364105Vn<? super C480301tx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = str;
        this.LLILZIL = newCreatorCaptionEditItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C480301tx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCreatorCaptionEditViewModel@b8c6.submitTranslatedCaptions$1$response$1");
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
            long j = this.LLILLJJLI;
            long j2 = this.LLILLL;
            String str = this.LLILZ;
            List<CreatorCaptionEditData> list = this.LLILZIL.transSubtitleItem;
            this.LL = 1;
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(list);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(j);
            linkedHashMap.put("original_subtitle_id", C2188811AlT.LIZIZ(sbLIZ));
            linkedHashMap.put("item_id", String.valueOf(j2));
            linkedHashMap.put("target_lang", str);
            linkedHashMap.put("edit_subtitles", String.valueOf(strLJI));
            obj = C01WU.LIZ().suspendUpdateTranslatedCaption(linkedHashMap, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.submitTranslatedCaptions$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.submitTranslatedCaptions$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
