package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: renamed from: X.0ImU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C476560ImU extends RecyclerView.ViewHolder {
    public final InterfaceC476580ImW LL;
    public GameDrawerCategory LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;

    public void onViewDetachedFromWindow() {
        this.LLILZ = false;
    }

    public final void L5(String str) {
        GameDrawerCategory gameDrawerCategory = this.LLILLJJLI;
        if (gameDrawerCategory != null) {
            int i = !gameDrawerCategory.labels.isEmpty() ? 1 : 0;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_category_show");
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII(gameDrawerCategory.categoryName, "game_label");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "has_new_game_label");
            c474500IjALIZ.LJJII(gameDrawerCategory.rankType, "game_tab_show_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL + 1), "game_tab_rank");
            c474500IjALIZ.LJJII(Long.valueOf(gameDrawerCategory.viewerCount), "total_viewers");
            c474500IjALIZ.LIZ();
        }
    }

    public C476560ImU(View view, InterfaceC476580ImW interfaceC476580ImW) {
        super(view);
        this.LL = interfaceC476580ImW;
    }

    public void I5(GameDrawerCategory gameDrawerCategory, int i) {
        this.LLILLJJLI = gameDrawerCategory;
        this.LLILLL = i;
    }
}
