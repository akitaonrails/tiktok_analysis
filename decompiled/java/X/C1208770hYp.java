package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208770hYp implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
        }
    }

    public C1208770hYp(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1208770hYp c1208770hYp, CompoundButton compoundButton, boolean z) {
        String str;
        InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) c1208770hYp.l0;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C20684815ws.LJIILLIIL("make_favorite_collection_public", C2097908Jt.LIZJ(new Pair("public_status", str)));
        inputNameSheetFragment.LLJILJIL = z;
    }

    public static final void onCheckedChanged$1(C1208770hYp c1208770hYp, CompoundButton compoundButton, boolean z) {
        String str;
        EditCollectionFragment editCollectionFragment = (EditCollectionFragment) c1208770hYp.l0;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C20684815ws.LJIILLIIL("make_favorite_collection_public", C2097908Jt.LIZJ(new Pair("public_status", str)));
        editCollectionFragment.LLJJ = z;
        C1172600gcU c1172600gcU = editCollectionFragment.LLIZ;
        if (c1172600gcU != null) {
            c1172600gcU.setEnableSelect(!z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.ArrayList] */
    public static final void onCheckedChanged$2(C1208770hYp c1208770hYp, CompoundButton compoundButton, boolean z) {
        C1166800gT8 item = ((MixFeedManageCell) c1208770hYp.l0).getItem();
        if (item != null) {
            MixFeedManageCell mixFeedManageCell = (MixFeedManageCell) c1208770hYp.l0;
            if (z) {
                MixVideosManageViewModel mixVideosManageViewModelL5 = mixFeedManageCell.L5();
                String str = item.LLILLL;
                List<String> list = ((C1163820gOK) mixVideosManageViewModelL5.vmDispatcher.getState()).LLILLJJLI;
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new ArrayList();
                if (list != null) {
                    if (!list.contains(str)) {
                        AnonymousClass0885.LIZ((ArrayList) c259800zU.element, C13LP.LLIIII(list));
                        ((ArrayList) c259800zU.element).add(str);
                    } else {
                        return;
                    }
                }
                mixVideosManageViewModelL5.setStateImmediate(new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 713));
                return;
            }
            MixVideosManageViewModel mixVideosManageViewModelL52 = mixFeedManageCell.L5();
            String str2 = item.LLILLL;
            List<String> list2 = ((C1163820gOK) mixVideosManageViewModelL52.vmDispatcher.getState()).LLILLJJLI;
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = new ArrayList();
            if (list2 == null || !list2.contains(str2)) {
                return;
            }
            AnonymousClass0885.LIZ((ArrayList) c259800zU2.element, C13LP.LLIIII(list2));
            ((ArrayList) c259800zU2.element).remove(str2);
            mixVideosManageViewModelL52.setState(new AwS597S0100000_18(c259800zU2, (C259800zU<List<Aweme>>) 719));
        }
    }
}
