package X;

import java.util.Collections;

/* JADX INFO: renamed from: X.11ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540611ci extends AbstractC19524211a4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19524011a2
    public final void LJI() {
        C19540511ch c19540511ch = new C19540511ch();
        if (c19540511ch instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540511ch).LJII();
        }
        c19540511ch.LJIJ("ORIGINAL_FILE_PATH", "original_file_path");
        c19540511ch.LJIJ("MUTE_CHECK_RESULT", "mute_check_res");
        C19540111cd c19540111cd = new C19540111cd();
        if (c19540111cd instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540111cd).LJII();
        }
        c19540111cd.LJIJ("Original_File_Path", "original_file_path");
        c19540111cd.LJIJ("Set_Extract_File_Path", "extract_file_path");
        c19540111cd.LJIJ("Extract_File_Path", "extract_res_path");
        C19540311cf c19540311cf = new C19540311cf();
        if (c19540311cf instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540311cf).LJII();
        }
        c19540311cf.LJIJ("AUTH_KEY", "authKey");
        C19539911cb c19539911cb = new C19539911cb();
        if (c19539911cb instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19539911cb).LJII();
        }
        c19539911cb.LJIJ("AUTH_KEY", "authKey");
        c19539911cb.LJIJ("Extract_File_Path", "extract_res_path");
        c19539911cb.LJIJ("VID", "original_vid");
        c19540311cf.LJJIIZ(1, "schedule_item_all");
        c19539911cb.LJJIIJ("schedule_handler_all", C1697810uHb.LJIIJJI(c19540111cd, c19540311cf));
        c19540511ch.LJJIIZ(1, "schedule_item_add_to_max");
        LJJIJIIJIL(c19540511ch, "_CONNECT_ID_DEFAULT", c19540111cd);
        LJJIJIIJIL(c19540511ch, "_CONNECT_ID_DEFAULT", c19540311cf);
        LJJIJIIJIL(c19540111cd, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIJIIJIL(c19540311cf, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIZ(Collections.singletonList(c19540511ch));
        LJJIL(Collections.singletonList(c19539911cb), null);
    }

    @Override // X.AbstractC19524211a4
    public final void LJJIJL() {
        C19522911Zr c19522911Zr = new C19522911Zr();
        c19522911Zr.LIZIZ("CheckAudioFile", new C19542111cx());
        c19522911Zr.LIZIZ("GetAuthKey", new C19542411d0());
        c19522911Zr.LIZIZ("SingleExtract", new C19542611d2());
        c19522911Zr.LIZIZ("UploadAudio", new C19542711d3());
        this.LIZLLL = c19522911Zr;
    }
}
