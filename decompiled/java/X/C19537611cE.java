package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import njp.a;

/* JADX INFO: renamed from: X.11cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.UploadAudioHandler$handleData$2", f = "UploadAudioHandler.kt", l = {30}, m = "invokeSuspend")
public final class C19537611cE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C19536911c7 LLILZ;
    public final /* synthetic */ C19538211cK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19537611cE(C19536911c7 c19536911c7, C19538211cK c19538211cK, InterfaceC1364105Vn<? super C19537611cE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c19536911c7;
        this.LLILZIL = c19538211cK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19537611cE(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UploadAuthKeyConfig uploadAuthKeyConfig;
        List<C19536311c1> list;
        int i;
        String str;
        int i2;
        C19538011cI c19538011cI;
        String strLIZ;
        Object objLJ = obj;
        C1C7U.LIZ("UploadAudioHandler@f8b.handleData$2");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILLL;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.LLILLJJLI;
                list = (List) this.LL;
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            C19536911c7 c19536911c7 = this.LLILZ;
            C1433060nOa c1433060nOa = c19536911c7.LJII;
            if (c1433060nOa != null && (uploadAuthKeyConfig = c1433060nOa.LIZIZ) != null) {
                list = c19536911c7.LJFF;
                if (list != null) {
                    i = 0;
                    for (C19536311c1 c19536311c1 : list) {
                        long jLJIIL = C2286708xd.LJIIL(c19536311c1.LIZLLL);
                        int i4 = (int) jLJIIL;
                        c19536311c1.LJIIJJI = i4;
                        if (jLJIIL > i) {
                            i = i4;
                        }
                    }
                    C19538211cK c19538211cK = this.LLILZIL;
                    AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this.LLILZ, 863);
                    C19545711dX c19545711dX = new C19545711dX(uploadAuthKeyConfig, null);
                    this.LL = list;
                    this.LLILLJJLI = i;
                    this.LLILLL = 1;
                    c19538211cK.getClass();
                    objLJ = C2296808zG.LJ(new C353110Dsr(c19538211cK, list, awS608S0100000_29, c19545711dX, null), this);
                    if (objLJ == objLJFF) {
                        C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2");
                        return objLJFF;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2");
                return false;
            }
        }
        ArrayList arrayList = new ArrayList();
        C19538211cK c19538211cK2 = this.LLILZIL;
        C19536911c7 c19536911c72 = this.LLILZ;
        int i5 = 0;
        for (Object obj2 : (List) objLJ) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                C19538411cM c19538411cM = (C19538411cM) obj2;
                C19536311c1 c19536311c12 = (C19536311c1) C13LP.LJJJLZIJ(i5, list);
                if (c19536311c12 != null) {
                    if (c19538411cM.LIZ) {
                        c19536311c12.LJI = c19538411cM.LIZIZ;
                        arrayList.add(c19536311c12);
                        if (!c19538411cM.LIZLLL) {
                            String str2 = c19538411cM.LIZIZ;
                            if (str2 != null && (c19538011cI = c19536911c72.LJIIIZ) != null && (strLIZ = C349090DmN.LIZ(c19536311c12)) != null) {
                                c19538011cI.LIZJ.put(strLIZ, new C19538611cO(str2));
                            }
                            c19536311c12.LJIIIZ = false;
                        } else {
                            c19536311c12.LJIIIZ = true;
                        }
                    } else {
                        c19538211cK2.getClass();
                        c19536311c12.LJIILJJIL = 20;
                        AbstractVideoUploader.VideoUploadInfo videoUploadInfo = c19538411cM.LIZJ;
                        if (videoUploadInfo == null || (str = videoUploadInfo.mExtra) == null) {
                            str = "";
                        }
                        c19536311c12.LJIILIIL = str;
                        if (videoUploadInfo != null) {
                            i2 = (int) videoUploadInfo.mErrorCode;
                        } else {
                            i2 = 20000;
                        }
                        c19536311c12.LJIIL = i2;
                        C19533811bc c19533811bc = c19536911c72.LJIIJ;
                        c19533811bc.LJI = i2;
                        c19533811bc.LJII = str;
                    }
                }
                i5 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C19533811bc c19533811bc2 = this.LLILZ.LJIIJ;
        c19533811bc2.LIZLLL = i;
        c19533811bc2.LIZ = this.LLILZIL.LIZIZ;
        c19533811bc2.LIZIZ = arrayList.size();
        C19533811bc c19533811bc3 = this.LLILZ.LJIIJ;
        int i7 = c19533811bc3.LIZIZ;
        if (i7 == 0) {
            c19533811bc3.LIZJ = 0.0d;
        } else {
            c19533811bc3.LIZJ = ((double) c19533811bc3.LIZ) / ((double) i7);
        }
        if (arrayList.size() == list.size()) {
            this.LLILZ.LJFF = arrayList;
            C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2");
            return true;
        }
        C1C7U.LIZIZ("UploadAudioHandler@f8b.handleData$2");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
