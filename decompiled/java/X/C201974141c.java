package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.141c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201974141c extends AbstractC201976141e implements InterfaceC20023413We {
    public InterfaceC201978141g LLILZ;
    public CompletionBlock<InterfaceC201975141d> LLILZIL;
    public final int LLILLL = 40003;
    public final String LLILZLL = "ChooseImageForGameMethod";

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        String containerID;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext;
        InterfaceC201978141g interfaceC201978141g = (InterfaceC201978141g) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            this.LLILZ = interfaceC201978141g;
            this.LLILZIL = completionBlock;
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            Fragment fragment = null;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if ((c1537480q70LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70LIZIZ) != null) {
                interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
            } else {
                interfaceC1059280dfiLJJIJLIJ = null;
            }
            if (interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup) {
                fragment = (Fragment) interfaceC1059280dfiLJJIJLIJ;
            }
            C20190713zN.LIZ(this.LLILLL, activityLIZLLL, fragment);
            if (interfaceC1059280dfiLJJIJLIJ instanceof InterfaceC1432560nNm) {
                ((InterfaceC1432560nNm) interfaceC1059280dfiLJJIJLIJ).KF(new InterfaceC1387820mDc() { // from class: X.141h
                    @Override // X.InterfaceC1387820mDc
                    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
                        this.LIZ.onActivityResult(i, i2, intent);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20023413We
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        InterfaceC634840OvC interfaceC634840OvC;
        Activity activityLIZLLL;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        View view;
        InterfaceC201978141g interfaceC201978141g;
        Number maxSize;
        Number maxSize2;
        Number maxSize3;
        if (i == this.LLILLL && (interfaceC634840OvC = this.IBridgeSdkContext) != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            if (i2 == -1 && intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                if (data != null) {
                    InputStream inputStream = null;
                    String string = null;
                    InputStream inputStream2 = null;
                    try {
                        if (BitmapFactory.decodeStream(C09NT.LJ(activityLIZLLL.getContentResolver(), data)) != null) {
                            try {
                                try {
                                    InputStream inputStreamLJ = C09NT.LJ(activityLIZLLL.getContentResolver(), data);
                                    if (inputStreamLJ == null) {
                                        numValueOf = null;
                                    } else {
                                        try {
                                            numValueOf = Integer.valueOf(inputStreamLJ.available());
                                        } catch (Exception e) {
                                            e = e;
                                            inputStream = inputStreamLJ;
                                            TryCatchGuardChecker.doCheck(e);
                                            C766270U4b.LJIIIZ(C786410Ut5.N3(activityLIZLLL), C497740JfY.LJIJI(2131855118));
                                            if (inputStream != null) {
                                                inputStream.close();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStream2 = inputStreamLJ;
                                            TryCatchGuardChecker.doCheck(th);
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    String str = this.LLILZLL;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("fileSize: ");
                                    sbLIZ.append(numValueOf);
                                    sbLIZ.append(", maxSize: ");
                                    InterfaceC201978141g interfaceC201978141g2 = this.LLILZ;
                                    if (interfaceC201978141g2 != null && (maxSize3 = interfaceC201978141g2.getMaxSize()) != null) {
                                        numValueOf2 = Integer.valueOf(maxSize3.intValue());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    sbLIZ.append(numValueOf2);
                                    C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                                    InterfaceC201978141g interfaceC201978141g3 = this.LLILZ;
                                    if (interfaceC201978141g3 != null && (maxSize2 = interfaceC201978141g3.getMaxSize()) != null) {
                                        numValueOf3 = Integer.valueOf(maxSize2.intValue());
                                    } else {
                                        numValueOf3 = null;
                                    }
                                    Comparator comparatorLIZLLL = C20085613iQ.LIZLLL();
                                    if (numValueOf3 != numValueOf && (numValueOf3 == null || (numValueOf != null && comparatorLIZLLL.compare(numValueOf3, numValueOf) < 0))) {
                                        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                                        if (interfaceC634840OvC2 != null && (view = interfaceC634840OvC2.getView()) != null && (interfaceC201978141g = this.LLILZ) != null && (maxSize = interfaceC201978141g.getMaxSize()) != null) {
                                            int iIntValue = maxSize.intValue();
                                            C1389890mGx c1389890mGx = new C1389890mGx(view);
                                            c1389890mGx.LJIIJ(C497740JfY.LJIJJ(2131853479, Integer.valueOf((iIntValue / 1024) / 1024)));
                                            c1389890mGx.LJIIJJI();
                                        }
                                        CompletionBlock<InterfaceC201975141d> completionBlock = this.LLILZIL;
                                        if (completionBlock != null) {
                                            C2382909Vj.LIZ(completionBlock, 0, "request error.", null, 4);
                                        }
                                        if (inputStreamLJ == null) {
                                            return;
                                        }
                                    } else {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("uri", data);
                                        jSONObject.put("file_name", data.getPath());
                                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC201975141d.class, null);
                                        InterfaceC201975141d interfaceC201975141d = (InterfaceC201975141d) xBaseModelLIZJ;
                                        InterfaceC201977141f[] interfaceC201977141fArr = new InterfaceC201977141f[1];
                                        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC201977141f.class, null);
                                        InterfaceC201977141f interfaceC201977141f = (InterfaceC201977141f) xBaseModelLIZJ2;
                                        interfaceC201977141f.setPath(C786410Ut5.J3(jSONObject));
                                        if (numValueOf != null) {
                                            string = numValueOf.toString();
                                        }
                                        interfaceC201977141f.setSize(string);
                                        interfaceC201977141f.setBase64Data("");
                                        interfaceC201977141fArr[0] = xBaseModelLIZJ2;
                                        interfaceC201975141d.setTempFiles(C1697810uHb.LJ(interfaceC201977141fArr));
                                        InterfaceC201975141d interfaceC201975141d2 = (InterfaceC201975141d) xBaseModelLIZJ;
                                        CompletionBlock<InterfaceC201975141d> completionBlock2 = this.LLILZIL;
                                        if (completionBlock2 != null) {
                                            completionBlock2.onSuccess(interfaceC201975141d2, "");
                                        }
                                        if (inputStreamLJ == null) {
                                            return;
                                        }
                                    }
                                    inputStreamLJ.close();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJ(this.LLILZLL, e3.toString());
                    }
                    C20441214yg.LIZIZ(this.LLILZLL, "bitmap is null, pic doesn't exist.");
                    C12ES.LJ(activityLIZLLL, R.drawable.ec6, activityLIZLLL.getString(2131855117));
                    C766270U4b.LJIIIZ(C786410Ut5.N3(activityLIZLLL), C497740JfY.LJIJI(2131855118));
                    return;
                }
                return;
            }
            C766270U4b.LJIIIZ(C786410Ut5.N3(activityLIZLLL), C497740JfY.LJIJI(2131855118));
        }
    }
}
