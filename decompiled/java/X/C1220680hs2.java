package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS79S0500000_19;

/* JADX INFO: renamed from: X.0hs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220680hs2 extends C09AY implements InterfaceC1631630sYr<InterfaceC1691180u6u, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<C12823050b> LL;
    public final /* synthetic */ MentionFavoriteVideoVM LLILLJJLI;
    public final /* synthetic */ IAVPublishService LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ MentionVideoShareModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220680hs2(List<C12823050b> list, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view, MentionVideoShareModel mentionVideoShareModel) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = mentionFavoriteVideoVM;
        this.LLILLL = iAVPublishService;
        this.LLILZ = view;
        this.LLILZIL = mentionVideoShareModel;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(InterfaceC1691180u6u interfaceC1691180u6u, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i = 32;
            } else {
                i = 16;
            }
            iIntValue2 |= i;
        }
        if ((iIntValue2 & 145) == 144 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            MentionFavoriteVideoVM mentionFavoriteVideoVM = this.LLILLJJLI;
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(mentionFavoriteVideoVM.wQ2()));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            interfaceC1680500tpg2.LJ();
            C12823050b c12823050b = (C12823050b) ListProtector.get(this.LL, iIntValue);
            boolean zBooleanValue = ((Boolean) c05p0.getValue()).booleanValue();
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJII = interfaceC1680500tpg2.LJII(c12823050b) | interfaceC1680500tpg2.LJII(this.LLILLJJLI) | interfaceC1680500tpg2.LJII(this.LLILLL) | interfaceC1680500tpg2.LJII(this.LLILZ) | interfaceC1680500tpg2.LJII(this.LLILZIL);
            MentionFavoriteVideoVM mentionFavoriteVideoVM2 = this.LLILLJJLI;
            IAVPublishService iAVPublishService = this.LLILLL;
            View view = this.LLILZ;
            MentionVideoShareModel mentionVideoShareModel = this.LLILZIL;
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS79S0500000_19(c12823050b, mentionFavoriteVideoVM2, iAVPublishService, view, mentionVideoShareModel, 41);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            Function0 function0 = (Function0) objLJJ2;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJII2 = interfaceC1680500tpg2.LJII(c12823050b) | interfaceC1680500tpg2.LJII(this.LLILLJJLI) | interfaceC1680500tpg2.LJII(this.LLILLL) | interfaceC1680500tpg2.LJII(this.LLILZIL);
            MentionFavoriteVideoVM mentionFavoriteVideoVM3 = this.LLILLJJLI;
            IAVPublishService iAVPublishService2 = this.LLILLL;
            MentionVideoShareModel mentionVideoShareModel2 = this.LLILZIL;
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS79S0500000_19(c12823050b, (C12823050b) mentionFavoriteVideoVM3, (MentionFavoriteVideoVM) iAVPublishService2, (IAVPublishService) mentionVideoShareModel2, (MentionVideoShareModel) c05p0, (C05P0<Boolean>) 42);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            interfaceC1680500tpg2.LJ();
            C1670140tYy.LIZ(c12823050b, zBooleanValue, function0, null, (Function0) objLJJ3, interfaceC1680500tpg2, 0, 8);
        }
        return Unit.LIZ;
    }
}
