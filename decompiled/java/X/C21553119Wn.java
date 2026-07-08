package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21553119Wn extends C21553019Wm implements C19X6 {
    public static final Method LLJLILLLLZIIL;
    public C21553219Wo LLJLIL;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                LLJLILLLLZIIL = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C19X6
    public final void LIZ(C19V6 c19v6, C21548219Uq c21548219Uq) {
        C21553219Wo c21553219Wo = this.LLJLIL;
        if (c21553219Wo != null) {
            c21553219Wo.LIZ(c19v6, c21548219Uq);
        }
    }

    @Override // X.C19X6
    public final void LIZIZ(C19V6 c19v6, MenuItem menuItem) {
        C21553219Wo c21553219Wo = this.LLJLIL;
        if (c21553219Wo != null) {
            c21553219Wo.LIZIZ(c19v6, menuItem);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19Wg, X.19Wh] */
    @Override // X.C21553019Wm
    public final C21552519Wh LIZJ(final Context context, final boolean z) {
        ?? r0 = new C21552519Wh(context, z) { // from class: X.19Wg
            public final int LLJILJILJ;
            public final int LLJILLL;
            public C19X6 LLJJ;
            public C21548219Uq LLJJI;

            @Override // X.C21552519Wh, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                C21549919Vh c21549919Vh;
                int headersCount;
                C21548219Uq c21548219UqLIZJ;
                int iPointToPosition;
                int i;
                if (this.LLJJ != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        c21549919Vh = (C21549919Vh) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c21549919Vh = (C21549919Vh) adapter;
                        headersCount = 0;
                    }
                    if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < c21549919Vh.getCount()) {
                        c21548219UqLIZJ = c21549919Vh.LIZJ(i);
                    } else {
                        c21548219UqLIZJ = null;
                    }
                    C21548219Uq c21548219Uq = this.LLJJI;
                    if (c21548219Uq != c21548219UqLIZJ) {
                        C19V6 c19v6 = c21549919Vh.LL;
                        if (c21548219Uq != null) {
                            this.LLJJ.LIZIZ(c19v6, c21548219Uq);
                        }
                        this.LLJJI = c21548219UqLIZJ;
                        if (c21548219UqLIZJ != null) {
                            this.LLJJ.LIZ(c19v6, c21548219UqLIZJ);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            public void setHoverListener(C19X6 c19x6) {
                this.LLJJ = c19x6;
            }

            @Override // X.C21552519Wh, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }

            {
                super(context, z);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.LLJILJILJ = 21;
                    this.LLJILLL = 22;
                } else {
                    this.LLJILJILJ = 22;
                    this.LLJILLL = 21;
                }
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C21549919Vh c21549919Vh;
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null) {
                    if (i == this.LLJILJILJ) {
                        if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                            performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                        }
                        return true;
                    }
                    if (i == this.LLJILLL) {
                        setSelection(-1);
                        ListAdapter adapter = getAdapter();
                        if (adapter instanceof HeaderViewListAdapter) {
                            c21549919Vh = (C21549919Vh) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                        } else {
                            c21549919Vh = (C21549919Vh) adapter;
                        }
                        c21549919Vh.LL.LIZJ(false);
                        return true;
                    }
                }
                return super.onKeyDown(i, keyEvent);
            }
        };
        r0.setHoverListener(this);
        return r0;
    }

    public C21553119Wn(Context context, int i, int i2) {
        super(context, null, i, i2);
    }
}
