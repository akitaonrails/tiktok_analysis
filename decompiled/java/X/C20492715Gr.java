package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20492715Gr extends AbstractC683590Qrd<MusicCollectionItem> {
    public C20492915Gt LL;
    public InterfaceC1888280zEo LLILLJJLI;

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCollectionItem musicCollectionItem;
        C20492815Gs c20492815Gs = (C20492815Gs) viewHolder;
        if (!C086I.LIZIZ(this.mmItems) && i >= 0 && i < this.mmItems.size() && (musicCollectionItem = (MusicCollectionItem) ListProtector.get(this.mmItems, i)) != null) {
            c20492815Gs.LLILLL = musicCollectionItem;
            C1324840ka2.LJFF(c20492815Gs.LL, musicCollectionItem.cover);
            c20492815Gs.LLILLJJLI.setText(musicCollectionItem.mcName);
            InterfaceC1888280zEo interfaceC1888280zEo = c20492815Gs.LLILZ.LLILLJJLI;
            if (interfaceC1888280zEo != null) {
                interfaceC1888280zEo.D4(musicCollectionItem);
                return;
            }
            return;
        }
        c20492815Gs.getClass();
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C20492815Gs(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxf, viewGroup, false));
    }
}
