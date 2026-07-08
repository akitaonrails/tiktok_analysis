package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C922790a7Z extends C2217421BqW implements Function1<EnumC928610aGx, Unit> {
    public C922790a7Z(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "onSelectedSwitchItem", "onSelectedSwitchItem(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/model/ItemConfig;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC928610aGx enumC928610aGx) {
        EnumC928610aGx enumC928610aGx2 = enumC928610aGx;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.I = enumC928610aGx2;
        multiLiveAsAnchorListDialogV2.LLLLLLLLLL = false;
        if (enumC928610aGx2 == EnumC928610aGx.SUGGEST) {
            C923190a8D.LJI("click");
        }
        boolean zLIZ = C919610a2R.LIZ();
        C410901il c410901il = multiLiveAsAnchorListDialogV2.LLLLLJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c410901il, 10));
        Iterator<Object> it2 = c410901il.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        C410901il c410901il2 = multiLiveAsAnchorListDialogV2.LLLLJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c410901il2, 10));
        Iterator<Object> it3 = c410901il2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next());
        }
        C410901il c410901il3 = multiLiveAsAnchorListDialogV2.LLLLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(c410901il3, 10));
        Iterator<Object> it4 = c410901il3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(it4.next());
        }
        List<? extends LinkPlayerInfo> list = multiLiveAsAnchorListDialogV2.LLJLLIL;
        List<? extends LinkPlayerInfo> list2 = multiLiveAsAnchorListDialogV2.LLJLLL;
        C410901il c410901il4 = multiLiveAsAnchorListDialogV2.LLLLJI;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(c410901il4, 10));
        Iterator<Object> it5 = c410901il4.iterator();
        while (it5.hasNext()) {
            arrayList4.add(it5.next());
        }
        C410901il c410901il5 = multiLiveAsAnchorListDialogV2.LLLLLIL;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(c410901il5, 10));
        Iterator<Object> it6 = c410901il5.iterator();
        while (it6.hasNext()) {
            arrayList5.add(it6.next());
        }
        C410901il c410901il6 = multiLiveAsAnchorListDialogV2.LLLLLLIL;
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(c410901il6, 10));
        Iterator<Object> it7 = c410901il6.iterator();
        while (it7.hasNext()) {
            arrayList6.add(it7.next());
        }
        C410901il c410901il7 = multiLiveAsAnchorListDialogV2.LLLLLLJ;
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(c410901il7, 10));
        Iterator<Object> it8 = c410901il7.iterator();
        while (it8.hasNext()) {
            arrayList7.add(it8.next());
        }
        multiLiveAsAnchorListDialogV2.LLJJL(zLIZ, arrayList, arrayList2, arrayList3, list, list2, arrayList4, arrayList5, arrayList6, arrayList7, multiLiveAsAnchorListDialogV2.LLJZIJLIL);
        return Unit.LIZ;
    }
}
