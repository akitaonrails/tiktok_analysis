package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [RESOURCE_ITEM_VIEW_HOLDER] */
/* JADX INFO: renamed from: X.11gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19563911gT<RESOURCE_ITEM_VIEW_HOLDER> extends C2217421BqW implements InterfaceC1631620sYq<RESOURCE_ITEM_VIEW_HOLDER, Integer, C0FGT, Unit> {
    public C19563911gT(Object obj) {
        super(3, obj, AbstractC19563811gS.class, "bindResourceItemViewHolder", "bindResourceItemViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILcom/ss/android/ugc/aweme/tools/sticker/common/text/pro/base/ResourceItemData;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Object obj, Integer num, C0FGT c0fgt) {
        num.intValue();
        ((AbstractC19563811gS) this.receiver).LLLLLJIL((RecyclerView.ViewHolder) obj, c0fgt);
        return Unit.LIZ;
    }
}
