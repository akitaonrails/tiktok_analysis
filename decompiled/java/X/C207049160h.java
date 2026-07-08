package X;

import com.ss.android.ugc.aweme.cla.et.newet.ClaCaptionConsistencyCheckEvent;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C207049160h extends C2217421BqW implements Function1<Long, Unit> {
    public C207049160h(ICLAPerfETServiceImpl iCLAPerfETServiceImpl) {
        super(1, iCLAPerfETServiceImpl, ICLAPerfETServiceImpl.class, "reportCaptionNotShownInColdStartSession", "reportCaptionNotShownInColdStartSession(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        l.longValue();
        ICLAPerfETServiceImpl iCLAPerfETServiceImpl = (ICLAPerfETServiceImpl) this.receiver;
        iCLAPerfETServiceImpl.getClass();
        boolean zLIZIZ = C746760TRa.LIZ().LIZIZ();
        boolean zLJL = C746760TRa.LIZ().LJL();
        C00I7 c00i7LJJII = iCLAPerfETServiceImpl.LJJII();
        ClaCaptionConsistencyCheckEvent claCaptionConsistencyCheckEvent = new ClaCaptionConsistencyCheckEvent();
        Object obj4 = null;
        if (c00i7LJJII != null) {
            obj = c00i7LJJII.LLILLL;
        } else {
            obj = null;
        }
        Object obj5 = "";
        if (obj == null) {
            obj = "";
        }
        claCaptionConsistencyCheckEvent.LJI(obj, "author_id");
        if (c00i7LJJII != null && (obj3 = c00i7LJJII.LL) != null) {
            obj5 = obj3;
        }
        claCaptionConsistencyCheckEvent.LJI(obj5, "group_id");
        if (c00i7LJJII != null) {
            obj2 = c00i7LJJII.LLILZ;
        } else {
            obj2 = null;
        }
        claCaptionConsistencyCheckEvent.LJI(obj2, "enter_from");
        claCaptionConsistencyCheckEvent.LJI(EnumC1782660wUS.ORIGINAL.getValue(), "displayed_caption_type");
        claCaptionConsistencyCheckEvent.LJI(EnumC1782700wUW.CAPTION_NOT_SHOWN_WHEN_CAPTION_SWITCH_ON.getValue(), "mismatch_type");
        claCaptionConsistencyCheckEvent.LJI(null, "caption_lang_code");
        if (c00i7LJJII != null) {
            obj4 = c00i7LJJII.LLILZLL;
        }
        claCaptionConsistencyCheckEvent.LJI(obj4, "target_translation_lang");
        claCaptionConsistencyCheckEvent.LJI(Integer.valueOf(zLIZIZ ? 1 : 0), "is_caption_on_native");
        claCaptionConsistencyCheckEvent.LJI(Integer.valueOf(zLJL ? 1 : 0), "is_caption_on_foreign");
        claCaptionConsistencyCheckEvent.LJI(Integer.valueOf(C746760TRa.LIZ().LJLILLLLZI() ? 1 : 0), "is_master_translation_on");
        if (c00i7LJJII != null) {
            i = c00i7LJJII.LLIZLLLIL;
        } else {
            i = 0;
        }
        claCaptionConsistencyCheckEvent.LJI(Integer.valueOf(i), "is_landscape_screen");
        claCaptionConsistencyCheckEvent.LJIIIIZZ();
        return Unit.LIZ;
    }
}
