package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19W8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19W8 extends WindowCallbackC1202580hOq {
    public C21550719Vp LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final /* synthetic */ AppCompatDelegateImpl LLILZLL;

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.LLILLL) {
            this.LL.onContentChanged();
        }
    }

    public final void LIZ(Window.Callback callback) {
        try {
            this.LLILLL = true;
            callback.onContentChanged();
            this.LLILLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL = false;
            throw th;
        }
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.LLILZ) {
            return this.LL.dispatchKeyEvent(keyEvent);
        }
        if (!this.LLILZLL.LJJJIL(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            AppCompatDelegateImpl appCompatDelegateImpl = this.LLILZLL;
            int keyCode = keyEvent.getKeyCode();
            appCompatDelegateImpl.LJJJJLL();
            C19W7 c19w7 = appCompatDelegateImpl.LLJJ;
            if (c19w7 == null || !c19w7.LJIIIZ(keyCode, keyEvent)) {
                AppCompatDelegateImpl.PanelFeatureState panelFeatureState = appCompatDelegateImpl.LLLFZ;
                if (panelFeatureState != null && appCompatDelegateImpl.LJJJLL(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                    AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.LLLFZ;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.LJIIJJI = true;
                        return true;
                    }
                } else {
                    if (appCompatDelegateImpl.LLLFZ == null) {
                        AppCompatDelegateImpl.PanelFeatureState panelFeatureStateLJJJJL = appCompatDelegateImpl.LJJJJL(0);
                        appCompatDelegateImpl.LJJJLZIJ(panelFeatureStateLJJJJL, keyEvent);
                        boolean zLJJJLL = appCompatDelegateImpl.LJJJLL(panelFeatureStateLJJJJL, keyEvent.getKeyCode(), keyEvent);
                        panelFeatureStateLJJJJL.LJIIJ = false;
                        if (zLJJJLL) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C21550719Vp c21550719Vp = this.LLILLJJLI;
        if (c21550719Vp != null && i == 0) {
            return new View(c21550719Vp.LIZ.LIZ.getContext());
        }
        return super.onCreatePanelView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19W8(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback) {
        super(callback);
        this.LLILZLL = appCompatDelegateImpl;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof C19V6)) {
            return false;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LLILZLL;
        if (i == 108) {
            appCompatDelegateImpl.LJJJJLL();
            C19W7 c19w7 = appCompatDelegateImpl.LLJJ;
            if (c19w7 != null) {
                c19w7.LIZJ(true);
            }
            return true;
        }
        appCompatDelegateImpl.getClass();
        return true;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.LLILZIL) {
            this.LL.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LLILZLL;
        if (i == 108) {
            appCompatDelegateImpl.LJJJJLL();
            C19W7 c19w7 = appCompatDelegateImpl.LLJJ;
            if (c19w7 != null) {
                c19w7.LIZJ(false);
                return;
            }
            return;
        }
        if (i == 0) {
            AppCompatDelegateImpl.PanelFeatureState panelFeatureStateLJJJJL = appCompatDelegateImpl.LJJJJL(i);
            if (!panelFeatureStateLJJJJL.LJIIL) {
                return;
            }
            appCompatDelegateImpl.LJJJ(panelFeatureStateLJJJJL, false);
            return;
        }
        appCompatDelegateImpl.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.19V5, X.19Vc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(final ActionMode.Callback callback, int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LLILZLL;
        if (appCompatDelegateImpl.LLJJL && i == 0) {
            final Context context = appCompatDelegateImpl.LLJIJIL;
            ?? r1 = new InterfaceC21549419Vc(context, callback) { // from class: X.19V5
                public final ActionMode.Callback LIZ;
                public final Context LIZIZ;
                public final ArrayList<C21549219Va> LIZJ = new ArrayList<>();
                public final C830530Wi3<Menu, Menu> LIZLLL = new C830530Wi3<>();

                @Override // X.InterfaceC21549419Vc
                public final void LIZJ(AbstractC21549319Vb abstractC21549319Vb) {
                    this.LIZ.onDestroyActionMode(LJ(abstractC21549319Vb));
                }

                public final C21549219Va LJ(AbstractC21549319Vb abstractC21549319Vb) {
                    int size = this.LIZJ.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C21549219Va c21549219Va = (C21549219Va) ListProtector.get(this.LIZJ, i2);
                        if (c21549219Va != null && c21549219Va.LIZIZ == abstractC21549319Vb) {
                            return c21549219Va;
                        }
                    }
                    C21549219Va c21549219Va2 = new C21549219Va(this.LIZIZ, abstractC21549319Vb);
                    this.LIZJ.add(c21549219Va2);
                    return c21549219Va2;
                }

                {
                    this.LIZIZ = context;
                    this.LIZ = callback;
                }

                @Override // X.InterfaceC21549419Vc
                public final boolean LIZ(AbstractC21549319Vb abstractC21549319Vb, C19V6 c19v6) {
                    ActionMode.Callback callback2 = this.LIZ;
                    C21549219Va c21549219VaLJ = LJ(abstractC21549319Vb);
                    Menu c19v1 = this.LIZLLL.get(c19v6);
                    if (c19v1 == null) {
                        c19v1 = new C19V1(this.LIZIZ, c19v6);
                        this.LIZLLL.put(c19v6, c19v1);
                    }
                    return callback2.onPrepareActionMode(c21549219VaLJ, c19v1);
                }

                @Override // X.InterfaceC21549419Vc
                public final boolean LIZIZ(AbstractC21549319Vb abstractC21549319Vb, C19V6 c19v6) {
                    ActionMode.Callback callback2 = this.LIZ;
                    C21549219Va c21549219VaLJ = LJ(abstractC21549319Vb);
                    Menu c19v1 = this.LIZLLL.get(c19v6);
                    if (c19v1 == null) {
                        c19v1 = new C19V1(this.LIZIZ, c19v6);
                        this.LIZLLL.put(c19v6, c19v1);
                    }
                    return callback2.onCreateActionMode(c21549219VaLJ, c19v1);
                }

                @Override // X.InterfaceC21549419Vc
                public final boolean LIZLLL(AbstractC21549319Vb abstractC21549319Vb, MenuItem menuItem) {
                    return this.LIZ.onActionItemClicked(LJ(abstractC21549319Vb), new MenuItemC21548719Uv(this.LIZIZ, (InterfaceMenuItemC21548819Uw) menuItem));
                }
            };
            AbstractC21549319Vb abstractC21549319VbLJJIJ = this.LLILZLL.LJJIJ(r1);
            if (abstractC21549319VbLJJIJ != null) {
                return r1.LJ(abstractC21549319VbLJJIJ);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C19V6 c19v6;
        if (menu instanceof C19V6) {
            c19v6 = (C19V6) menu;
        } else {
            c19v6 = null;
        }
        if (i == 0 && c19v6 == null) {
            return false;
        }
        if (c19v6 != null) {
            c19v6.LJJ = true;
        }
        C21550719Vp c21550719Vp = this.LLILLJJLI;
        if (c21550719Vp != null && i == 0) {
            C19VG c19vg = c21550719Vp.LIZ;
            if (!c19vg.LIZLLL) {
                c19vg.LIZ.LJIIL = true;
                c19vg.LIZLLL = true;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c19v6 != null) {
            c19v6.LJJ = false;
        }
        return zOnPreparePanel;
    }

    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C19V6 c19v6 = this.LLILZLL.LJJJJL(0).LJII;
        if (c19v6 != null) {
            super.onProvideKeyboardShortcuts(list, c19v6, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }
}
