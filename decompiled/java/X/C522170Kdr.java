package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522170Kdr extends C09AY implements Function1<Function0<? extends Unit>, Unit> {
    public final /* synthetic */ MvChoosePhotoScene LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC1412640mre LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522170Kdr(MvChoosePhotoScene mvChoosePhotoScene, String str, EnumC1412640mre enumC1412640mre, String str2) {
        super(1);
        this.LL = mvChoosePhotoScene;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1412640mre;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function0<? extends Unit> function0) {
        AutoCutAnchorModel autoCutAnchorModel;
        C0L7H c0l7h;
        final int size;
        CreativeModel creativeModel;
        final Function0<? extends Unit> function02 = function0;
        C0L4U c0l4u = C0L4U.LIZ;
        ShortVideoContext shortVideoContext = this.LL.shortVideoContext;
        final String creationId = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            autoCutAnchorModel = creativeModel.autoCutAnchorModel;
        } else {
            autoCutAnchorModel = null;
        }
        c0l4u.getClass();
        String strLJ = C0L4U.LJ(autoCutAnchorModel);
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this.LL);
        if (c1drgLJIIIZ != null && (c0l7h = (C0L7H) c1drgLJIIIZ.LJIIL(null, C0L7H.class)) != null) {
            String str = this.LLILLJJLI;
            EnumC1412640mre enumC1412640mre = this.LLILLL;
            String str2 = this.LLILZ;
            C1418100n0S c1418100n0S = new C1418100n0S("autocut_anchor", str, enumC1412640mre);
            ShortVideoContext shortVideoContext2 = this.LL.shortVideoContext;
            if (shortVideoContext2 != null) {
                creationId = shortVideoContext2.getCreationId();
            }
            ArrayList<Integer> arrayList = this.LL.clipProcessItems;
            if (arrayList != null) {
                size = arrayList.size();
            } else {
                size = 0;
            }
            final String str3 = this.LLILLJJLI;
            final String str4 = this.LLILZ;
            final MvChoosePhotoScene mvChoosePhotoScene = this.LL;
            c0l7h.TA1(str, enumC1412640mre, str2, strLJ, c1418100n0S, new C0L4X(str3, str4, mvChoosePhotoScene, function02, creationId, size) { // from class: X.0Khv
                public final /* synthetic */ String LJIIIZ;
                public final /* synthetic */ MvChoosePhotoScene LJIIJ;
                public final /* synthetic */ Function0<Unit> LJIIJJI;

                @Override // X.C0L4X, X.C0L7K
                public final void LIZLLL(C0L7B c0l7b, boolean z) {
                    String str5;
                    super.LIZLLL(c0l7b, z);
                    MvChoosePhotoScene mvChoosePhotoScene2 = this.LJIIJ;
                    if (c0l7b != null) {
                        str5 = c0l7b.LIZLLL;
                    } else {
                        str5 = null;
                    }
                    mvChoosePhotoScene2.ugcTemplateUrl = str5;
                    mvChoosePhotoScene2.ccTemplateId = this.LJIIIZ;
                    this.LJIIJJI.invoke();
                }

                @Override // X.C0L4X, X.C0L7K
                public final void LIZJ(int i, String str5, boolean z) {
                    super.LIZJ(i, str5, z);
                    this.LJIIJJI.invoke();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(size, creationId, str3, str4, true);
                    this.LJIIIZ = str3;
                    this.LJIIJ = mvChoosePhotoScene;
                    this.LJIIJJI = function02;
                }
            }, new AwS552S0100000_8(function02, (Function0<Unit>) 283));
        }
        return Unit.LIZ;
    }
}
