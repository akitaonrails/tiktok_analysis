package X;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import com.ss.android.ugc.aweme.ttep.external.TTEPAbilityServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.14dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308614dI implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7<List<MediaModel>> c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public C20308614dI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C20308614dI c20308614dI, C15O7 c15o7) {
        AbstractC21673719rz itemAnimator;
        AbstractC21674919sB abstractC21674919sB;
        C1C7U.LIZ("ImageChooseActivity@dd41.loadData$2");
        if (C1256140inE.LIZ((Collection) c15o7.LJIIL())) {
            DialogC1389620mGW dialogC1389620mGW = ((ImageChooseActivity) c20308614dI.l0).LLILLJJLI;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            TextView textView = ((ImageChooseActivity) c20308614dI.l0).LLILZIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
            }
            ImageChooseActivity imageChooseActivity = (ImageChooseActivity) c20308614dI.l0;
            TextView textView2 = imageChooseActivity.LLILZIL;
            if (textView2 != null) {
                textView2.setText(imageChooseActivity.getResources().getString(2131838155));
            }
        } else {
            TextView textView3 = ((ImageChooseActivity) c20308614dI.l0).LLILZIL;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
            }
            DialogC1389620mGW dialogC1389620mGW2 = ((ImageChooseActivity) c20308614dI.l0).LLILLJJLI;
            if (dialogC1389620mGW2 != null) {
                dialogC1389620mGW2.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW2);
            }
            C20271714Tr c20271714Tr = ((ImageChooseActivity) c20308614dI.l0).LLILZLL;
            if (c20271714Tr != null) {
                c20271714Tr.LLLI((Collection) c15o7.LJIIL());
            }
            ImageChooseActivity imageChooseActivity2 = (ImageChooseActivity) c20308614dI.l0;
            RecyclerView recyclerView = imageChooseActivity2.LLILLL;
            if (recyclerView != null) {
                recyclerView.setAdapter(imageChooseActivity2.LLILZLL);
            }
            RecyclerView recyclerView2 = ((ImageChooseActivity) c20308614dI.l0).LLILLL;
            if (recyclerView2 != null) {
                itemAnimator = recyclerView2.getItemAnimator();
            } else {
                itemAnimator = null;
            }
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
            ImageChooseActivity imageChooseActivity3 = (ImageChooseActivity) c20308614dI.l0;
            C20271714Tr c20271714Tr2 = imageChooseActivity3.LLILZLL;
            if (c20271714Tr2 != null) {
                c20271714Tr2.LLJILJIL = imageChooseActivity3.LLJILJIL;
                c20271714Tr2.LLJILJILJ = imageChooseActivity3.LLJILJILJ;
            }
        }
        C1C7U.LIZIZ("ImageChooseActivity@dd41.loadData$2");
        return null;
    }

    public static final Object then$1(C20308614dI c20308614dI, C15O7 c15o7) {
        AbstractC21673719rz itemAnimator;
        AbstractC21674919sB abstractC21674919sB;
        C1C7U.LIZ("ImageChooseUploadActivity@57f9.loadData$2");
        if (C1256140inE.LIZ((Collection) c15o7.LJIIL())) {
            DialogC1389620mGW dialogC1389620mGW = ((ImageChooseUploadActivity) c20308614dI.l0).LLILLJJLI;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            TextView textView = ((ImageChooseUploadActivity) c20308614dI.l0).LLILZIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
            }
            ImageChooseUploadActivity imageChooseUploadActivity = (ImageChooseUploadActivity) c20308614dI.l0;
            TextView textView2 = imageChooseUploadActivity.LLILZIL;
            if (textView2 != null) {
                textView2.setText(imageChooseUploadActivity.getResources().getString(2131838155));
            }
        } else {
            TextView textView3 = ((ImageChooseUploadActivity) c20308614dI.l0).LLILZIL;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
            }
            DialogC1389620mGW dialogC1389620mGW2 = ((ImageChooseUploadActivity) c20308614dI.l0).LLILLJJLI;
            if (dialogC1389620mGW2 != null) {
                dialogC1389620mGW2.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW2);
            }
            C20271714Tr c20271714Tr = ((ImageChooseUploadActivity) c20308614dI.l0).LLILZLL;
            if (c20271714Tr != null) {
                c20271714Tr.LLLI((Collection) c15o7.LJIIL());
            }
            ImageChooseUploadActivity imageChooseUploadActivity2 = (ImageChooseUploadActivity) c20308614dI.l0;
            RecyclerView recyclerView = imageChooseUploadActivity2.LLILLL;
            if (recyclerView != null) {
                recyclerView.setAdapter(imageChooseUploadActivity2.LLILZLL);
            }
            RecyclerView recyclerView2 = ((ImageChooseUploadActivity) c20308614dI.l0).LLILLL;
            if (recyclerView2 != null) {
                itemAnimator = recyclerView2.getItemAnimator();
            } else {
                itemAnimator = null;
            }
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
            ImageChooseUploadActivity imageChooseUploadActivity3 = (ImageChooseUploadActivity) c20308614dI.l0;
            C20271714Tr c20271714Tr2 = imageChooseUploadActivity3.LLILZLL;
            if (c20271714Tr2 != null) {
                c20271714Tr2.LLJILJIL = imageChooseUploadActivity3.LLJILJIL;
                c20271714Tr2.LLJILJILJ = imageChooseUploadActivity3.LLJILJILJ;
            }
        }
        C1C7U.LIZIZ("ImageChooseUploadActivity@57f9.loadData$2");
        return null;
    }

    public static final Object then$2(C20308614dI c20308614dI, C15O7 c15o7) {
        final Effect effect;
        C1C7U.LIZ("TTEPAbilityServiceImpl@9eb0.downloadPreviewEffectAndResourceByFetch$1");
        if (AnonymousClass1186.LIZIZ(c15o7)) {
            try {
                if (((EffectFetchApiResBean) c15o7.LJIIL()).status != 0) {
                    ((IDownloadCallback) c20308614dI.l0).onFail(((EffectFetchApiResBean) c15o7.LJIIL()).status, ((EffectFetchApiResBean) c15o7.LJIIL()).message, null);
                } else {
                    TTEPAbilityServiceImpl.LIZ.getClass();
                    if (C0UER.LIZ == null) {
                        C1633850scR.LIZ(o.LIZ, null);
                    }
                    try {
                        Object objLJII = o.LIZIZ.LJII(u.LJJIFFI(((EffectFetchApiResBean) c15o7.LJIIL()).data, "\"types\"", "\"_type\"", false), Effect.class);
                        Effect effect2 = (Effect) objLJII;
                        effect2.setEffect_id(effect2.getId());
                        String uri = effect2.getFile_url().getUri();
                        if (uri == null) {
                            uri = "";
                        }
                        effect2.setId(uri);
                        effect = (Effect) objLJII;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (effect != null) {
                        DownloadableModelSupport downloadableModelSupport = DownloadableModelSupport.getInstance();
                        String[] strArr = (String[]) effect.getRequirements().toArray(new String[0]);
                        Map<String, List<String>> mapLIZ = AnonymousClass1186.LIZ(effect.getModel_names());
                        final IDownloadCallback iDownloadCallback = (IDownloadCallback) c20308614dI.l0;
                        downloadableModelSupport.fetchResourcesByRequirementsAndModelNames(strArr, mapLIZ, new IFetchResourceListener() { // from class: X.13ve
                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            public final void onFailure(Exception exc) {
                                iDownloadCallback.onFail(-10, "", exc);
                            }

                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            public final void onSuccess(long j) {
                                Effect effect3 = new Effect(effect);
                                effect3.setVerifySignatureExemptionEnabled(true, "TTEH QR code preview");
                                C1633850scR.LIZ(o.LIZ, null).LIZJ(effect3, new C20308014dC(iDownloadCallback, 1));
                            }
                        });
                    } else {
                        ((IDownloadCallback) c20308614dI.l0).onFail(-10, "", null);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                ((IDownloadCallback) c20308614dI.l0).onFail(-10, "", e2);
            }
        } else {
            ((IDownloadCallback) c20308614dI.l0).onFail(-10, "", c15o7.LJIIJJI());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTEPAbilityServiceImpl@9eb0.downloadPreviewEffectAndResourceByFetch$1");
        return unit;
    }
}
