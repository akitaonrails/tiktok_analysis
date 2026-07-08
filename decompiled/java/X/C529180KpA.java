package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C529180KpA extends AbstractC529520Kpi implements InterfaceC528130KnT {
    public final C0L9H LLJIJIL;
    public int LLJILJIL = -1;
    public InterfaceC529190KpB LLJILJILJ;

    @Override // X.AbstractC529520Kpi
    public final float LLLJ() {
        return 6.0f;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZLLLI() {
        int i = 0;
        for (TikTokMediaModel tikTokMediaModel : this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (LLLLIIIILLL(tikTokMediaModel)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIILL() {
        InterfaceC529190KpB interfaceC529190KpB;
        int i = this.LLJILJIL;
        if (i < 0 || i >= this.LLILLJJLI.size() || (interfaceC529190KpB = this.LLJILJILJ) == null) {
            return;
        }
        interfaceC529190KpB.LIZ((CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, this.LLJILJIL));
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLLIILLL() {
        return this.LLJIJIL == C0L9H.LIGHT ? R.drawable.a_i : R.drawable.a_h;
    }

    public final void LLLLLL() {
        int i = this.LLJILJIL;
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        LLLLIILL();
        notifyItemChanged(this.LLJILJIL);
    }

    public static final TikTokMediaModel LLLLLJIL() {
        TikTokMediaModel tikTokMediaModelLIZ = C527250Km3.LIZ().LIZ(UUID.randomUUID().toString(), EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL("");
        tikTokMediaModelLIZ.thumbnail = "";
        tikTokMediaModelLIZ.duration = 0L;
        tikTokMediaModelLIZ.type = 4;
        return tikTokMediaModelLIZ;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        int itemCount = getItemCount();
        int i = this.LLJILJIL;
        return (i < 0 || i >= itemCount) ? LLLILZLLLI() : i;
    }

    @Override // X.AbstractC529520Kpi
    public final CutSameVideoImageExtraData LLLJIL() {
        int iLLLILZLLLI = LLLILZLLLI();
        if (iLLLILZLLLI < 0 || iLLLILZLLLI >= this.LLILLJJLI.size()) {
            return null;
        }
        return (CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, iLLLILZLLLI);
    }

    public C529180KpA(C0L9H c0l9h) {
        this.LLJIJIL = c0l9h;
    }

    @Override // X.InterfaceC528130KnT
    public final void LLJIJIL(C528070KnN c528070KnN) {
        this.LLJILJILJ = c528070KnN;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int i = this.LLJILJIL;
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.LLJILJIL;
            ListProtector.remove(this.LL, i2);
            ListProtector.add(this.LL, i2, tikTokMediaModel);
            int i3 = this.LLJILJIL + 1;
            int itemCount = getItemCount();
            while (true) {
                if (i3 < itemCount) {
                    if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i3))) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    int i4 = this.LLJILJIL;
                    i3 = 0;
                    while (true) {
                        if (i3 < i4) {
                            if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i3))) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                }
            }
            this.LLJILJIL = i3;
            notifyItemChanged(i2);
            LLLLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLI(List<? extends TikTokMediaModel> list) {
        int iLLLILZLLLI = LLLILZLLLI();
        int itemCount = getItemCount();
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < itemCount) {
            ArrayList arrayList = (ArrayList) list;
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = i + iLLLILZLLLI;
                    if (i3 < itemCount) {
                        ListProtector.remove(this.LL, i3);
                        ListProtector.add(this.LL, i3, obj);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJILJIL = LLLILZLLLI();
            notifyItemRangeChanged(iLLLILZLLLI, arrayList.size() + 1);
            LLLLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LL, i)).LJFF(), tikTokMediaModel.LJFF()) && TextUtils.equals(((TikTokMediaModel) ListProtector.get(this.LL, i)).LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                if (i >= 0) {
                    int i2 = this.LLJILJIL;
                    this.LLJILJIL = i;
                    LLLLIILL();
                    this.LL.remove(tikTokMediaModel);
                    ListProtector.add(this.LL, i, LLLLLJIL());
                    notifyItemChanged(i);
                    if (i2 >= 0 && i2 < getItemCount()) {
                        notifyItemChanged(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLILI(List<? extends TikTokMediaModel> list) {
        super.LLLLILI(list);
        this.LLJILJIL = LLLILZLLLI();
        LLLLLL();
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        int i = 0;
        while (true) {
            if (i < size) {
                String str = ((MediaModel) ListProtector.get(this.LL, i)).id;
                str.toString();
                String str2 = ((MediaModel) tikTokMediaModel).id;
                str2.toString();
                if (TextUtils.equals(str, str2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LLJILJIL;
        if (i2 == i) {
            return;
        }
        if (i2 < 0 || i2 >= size) {
            i2 = -1;
        }
        if (i != -1) {
            this.LLJILJIL = i;
            notifyItemChanged(i);
            LLLLIILL();
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
        }
    }

    public final boolean LLLLLJLJLL(int i) {
        if (C580130Mp9.LIZ(this.LLILLJJLI) || i < 0 || i >= this.LLILLJJLI.size() || ListProtector.get(this.LLILLJJLI, i) == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC529520Kpi
    public final void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.LL.size() && adapterPosition2 < this.LL.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            ListProtector.add(this.LL, adapterPosition2, ListProtector.remove(this.LL, adapterPosition));
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIILIL(int i, int i2) {
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                this.LL.add(LLLLLJIL());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 >= 0 && i2 < i) {
            this.LLJILJIL = i2;
        }
        LLLLIILL();
        notifyDataSetChanged();
    }
}
