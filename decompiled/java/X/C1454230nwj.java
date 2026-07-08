package X;

import android.view.View;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454230nwj {
    public final VideoPublishEditModel LIZ;
    public final NLEEditor LIZIZ;
    public final AbstractC1452680nuE LIZJ;
    public final View LIZLLL;
    public final SingleImageData LJ;
    public final String LJFF;
    public final String LJI;
    public final C375830EoP<Boolean> LJII;
    public final Size LJIIIIZZ;
    public final C375830EoP<C783490UoN> LJIIIZ;
    public final C375830EoP<C0TM7> LJIIJ;

    public static C1454230nwj LIZ(C1454230nwj c1454230nwj, String str, String str2, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        VideoPublishEditModel videoPublishEditModel;
        NLEEditor nLEEditor;
        AbstractC1452680nuE abstractC1452680nuE;
        View view;
        SingleImageData singleImageData;
        C375830EoP<Boolean> c375830EoP3;
        C375830EoP c375830EoP4 = c375830EoP2;
        String str3 = str2;
        C375830EoP c375830EoP5 = c375830EoP;
        String str4 = str;
        Size size = null;
        if ((i & 1) != 0) {
            videoPublishEditModel = c1454230nwj.LIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 2) != 0) {
            nLEEditor = c1454230nwj.LIZIZ;
        } else {
            nLEEditor = null;
        }
        if ((i & 4) != 0) {
            abstractC1452680nuE = c1454230nwj.LIZJ;
        } else {
            abstractC1452680nuE = null;
        }
        if ((i & 8) != 0) {
            view = c1454230nwj.LIZLLL;
        } else {
            view = null;
        }
        if ((i & 16) != 0) {
            singleImageData = c1454230nwj.LJ;
        } else {
            singleImageData = null;
        }
        if ((i & 32) != 0) {
            str4 = c1454230nwj.LJFF;
        }
        if ((i & 64) != 0) {
            str3 = c1454230nwj.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP3 = c1454230nwj.LJII;
        } else {
            c375830EoP3 = null;
        }
        if ((i & 256) != 0) {
            size = c1454230nwj.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP5 = c1454230nwj.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP4 = c1454230nwj.LJIIJ;
        }
        c1454230nwj.getClass();
        return new C1454230nwj(videoPublishEditModel, nLEEditor, abstractC1452680nuE, view, singleImageData, str4, str3, c375830EoP3, size, c375830EoP5, c375830EoP4);
    }

    public C1454230nwj(VideoPublishEditModel videoPublishEditModel, NLEEditor nLEEditor, AbstractC1452680nuE abstractC1452680nuE, View view, SingleImageData singleImageData, String str, String str2, C375830EoP<Boolean> c375830EoP, Size size, C375830EoP<C783490UoN> c375830EoP2, C375830EoP<C0TM7> c375830EoP3) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = nLEEditor;
        this.LIZJ = abstractC1452680nuE;
        this.LIZLLL = view;
        this.LJ = singleImageData;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = c375830EoP;
        this.LJIIIIZZ = size;
        this.LJIIIZ = c375830EoP2;
        this.LJIIJ = c375830EoP3;
    }
}
