package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.gamora.editorpro.creationflow.album.EditorProAlbumService;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;

/* JADX INFO: renamed from: X.0EVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365800EVu {
    public static final C365800EVu LIZ = new C365800EVu();

    public final synchronized void LIZ(Context context) {
        System.currentTimeMillis();
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        if (C0E46.LIZ().LIZJ) {
            return;
        }
        C365810EVv c365810EVv = new C365810EVv();
        c365810EVv.LIZJ = new InterfaceC357880E1i() { // from class: X.0E1g
            @Override // X.InterfaceC357880E1i
            public final void LIZ(C357870E1h c357870E1h) {
                c357870E1h.LIZ(EnumC357850E1f.PICTURE_TRACK_TIME, 3000L);
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_CLICK_WHEN_DISABLE_FUNCTION_ITEM, Boolean.TRUE);
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_EFFECT, Boolean.valueOf(C0C0J.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_NLE_COMPOSER_FOR_EFFECT, Boolean.valueOf(C350500Doe.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.MAX_EDIT_VIDEO_LIMIT_TIME_MILLIS, Long.valueOf(C530010KqV.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L);
                EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_VOLUME_ADJUST_OPTIMIZATION;
                Boolean bool = Boolean.FALSE;
                c357870E1h.LIZ(enumC357850E1f, bool);
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, bool);
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, bool);
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_BLACK_SLOT_OPERATE, bool);
                c357870E1h.LIZ(EnumC357850E1f.NEW_SUBTRACK_STYLE_HEIGHT, Boolean.valueOf(C293820BfQ.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_PRELOAD_INFLATE, Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_preload_optimize", true, false)));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS, Boolean.valueOf(((Boolean) C267020AdI.LIZ.getValue()).booleanValue()));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_CHANGE_BTM_BAR_STYLE, Boolean.valueOf(C0EJA.LJI()));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_IMPORT_ANR_OPT, Boolean.valueOf(C298040BmE.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.valueOf(C0C1N.LIZ()));
                c357870E1h.LIZ(EnumC357850E1f.IS_DEBUG_APP, bool);
            }
        };
        c365810EVv.LJ = new InterfaceC369250Edn() { // from class: X.0E4E
            @Override // X.InterfaceC369250Edn
            public final void LIZ(View view, C0E4C c0e4c) {
                Context context2;
                if (view != null && (context2 = view.getContext()) != null) {
                    int i = C0E4D.LIZ[c0e4c.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            new C0ZDN(context2).LIZ(3);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    new C0ZDN(context2).LIZ(0);
                }
            }
        };
        c365810EVv.LIZLLL = new InterfaceC365850EVz() { // from class: X.0EW0
            @Override // X.InterfaceC365850EVz
            public final void LIZ() {
                C792600V7i.LIZIZ(IAlbumService.class, new InterfaceC792270V6b() { // from class: X.0EW1
                    @Override // X.InterfaceC792270V6b
                    public final Object create() {
                        return new EditorProAlbumService();
                    }
                });
            }
        };
        C365780EVs c365780EVs = new C365780EVs();
        C0CHQ.LIZ().LJJJ().LIZLLL();
        String.valueOf(1233);
        C19221910Hx.LIZIZ();
        c365810EVv.LIZIZ = new C365380EUe(new C365770EVr(c365780EVs));
        c365810EVv.LIZ = C786410Ut5.N3(context);
        C0E46.LIZ().LIZIZ(new C365820EVw(c365810EVv));
    }
}
