package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.commonguide;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1954807lC;
import X.C1BNE;
import X.C2252321DDq;
import X.C497740JfY;
import X.C588200N5e;
import X.C915980Zwa;
import X.C973660bRc;
import X.C975380bUO;
import X.EnumC588190N5d;
import X.EnumC919170a1j;
import X.EnumC944810ah5;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class CommonGuideViewModel extends ViewModel {
    public final EnumC588190N5d LL;
    public final EnumC919170a1j LLILLJJLI;
    public final Function1<EnumC919170a1j, Unit> LLILLL;
    public final AnonymousClass0951 LLILZ;
    public boolean LLILZIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C588200N5e.LIZ[this.LL.ordinal()] != 1) {
            throw new C1954807lC();
        }
        if (this.LLILZIL) {
            return;
        }
        C973660bRc.LIZ.LJJL("turn_off_random_trigger");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonGuideViewModel(EnumC588190N5d enumC588190N5d, EnumC919170a1j enumC919170a1j, Function1<? super EnumC919170a1j, Unit> function1) {
        Object value;
        String strLJIJI;
        String strLJIJI2;
        String strLJIJI3;
        this.LL = enumC588190N5d;
        this.LLILLJJLI = enumC919170a1j;
        this.LLILLL = function1;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C975380bUO(0));
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ);
        if (C588200N5e.LIZ[enumC588190N5d.ordinal()] != 1) {
            throw new C1954807lC();
        }
        do {
            value = c2252321DDqLIZ.getValue();
            strLJIJI = C497740JfY.LJIJI(2131853041);
            strLJIJI2 = C497740JfY.LJIJI(2131853040);
            strLJIJI3 = C497740JfY.LJIJI(2131853039);
            value.getClass();
        } while (!c2252321DDqLIZ.compareAndSet(value, new C975380bUO(R.drawable.ezb, strLJIJI, strLJIJI2, strLJIJI3)));
        C973660bRc c973660bRc = C973660bRc.LIZ;
        HashMap map = new HashMap();
        boolean zLJJJJ = C973660bRc.LJJJJ();
        map.put(C973660bRc.LJJII, "anchor");
        map.put(C973660bRc.LJ, String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        String str = C973660bRc.LJIILJJIL;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        map.put(str, CardStruct.IStatusCode.DEFAULT);
        map.put(C973660bRc.LJIIIIZZ, "pk_icon");
        C973660bRc.LJJIIJZLJL(map);
        c973660bRc.LJLLLLLL("livesdk_pk_ice_showdown_guide_popup_show", zLJJJJ ? "1" : str2, EnumC944810ah5.MANUAL_PK.getType(), "", map);
    }
}
