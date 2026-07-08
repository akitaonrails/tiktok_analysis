package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.tiktok.eventtracking.ab.EffectETGroupEnableConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0noh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449250noh {
    public final InterfaceC1624480sNK LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5765));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5764));

    public C1449250noh(InterfaceC1624480sNK interfaceC1624480sNK) {
        this.LIZ = interfaceC1624480sNK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZJ(Effect effect) {
        int i;
        List<EffectCategoryModel> listLJFF = C23117093z.LJFF(this.LIZ.getStickerRepository().LJFF());
        C1448480nnS c1448480nnS = (C1448480nnS) this.LIZ.LJII().LJIILL().getValue();
        if (c1448480nnS != null) {
            i = c1448480nnS.LIZ;
        } else {
            i = -1;
        }
        if (C1625940sPg.LJIIL(this.LIZ, effect) && i >= 0 && i < listLJFF.size()) {
            return ((EffectCategoryModel) ListProtector.get(listLJFF, i)).getKey();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (X.C1448620nng.LIZLLL(r12, r6, r15.creativeModel.feedPropPinModel) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (X.C1448620nng.LIZLLL(r12, r7, r15.creativeModel.feedPropPinModel) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(X.C1449000noI r14, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r15) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449250noh.LIZ(X.0noI, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):java.lang.String");
    }

    public final FaceStickerBean LIZIZ(CreativeModel creativeModel, Effect effect, String str) {
        String strLJFF;
        InterfaceC1282004zy next;
        List<InterfaceC1282004zy> list;
        String strLIZJ;
        C1449300nom c1449300nom = creativeModel.propETGroupModel;
        Iterator<InterfaceC1282004zy> it2 = c1449300nom.LIZ.iterator();
        while (true) {
            strLJFF = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C00YV) {
                    break;
                }
            } else {
                C1449310non c1449310non = c1449300nom.LIZIZ;
                if (c1449310non != null && (list = c1449310non.LIZIZ) != null) {
                    Iterator<InterfaceC1282004zy> it3 = list.iterator();
                    while (it3.hasNext()) {
                        next = it3.next();
                        if (next instanceof C00YV) {
                            break;
                        }
                    }
                    next = null;
                } else {
                    next = null;
                }
            }
        }
        C00YV c00yv = (C00YV) next;
        if (c00yv != null && EffectETGroupEnableConfig.isEnabled() && c00yv.LLILLJJLI.length() > 0 && (strLIZJ = c00yv.LLILLJJLI) != null) {
            if (effect != null) {
                strLJFF = DiyPropParser.LJFF(effect);
            }
        } else if (effect != null) {
            strLIZJ = LIZJ(effect);
            strLJFF = DiyPropParser.LJFF(effect);
        } else {
            strLIZJ = null;
        }
        return C1441210nbj.LIZIZ(effect, str, strLJFF, strLIZJ);
    }
}
