package X;

import X.C0SMB;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.LeftSlideGuideConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.ui.feed.commerce.VSAMultiPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.AdHintPhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotoHintViewHolder;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AwS137S0201000_11;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0SLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC719900SLs<VH extends C0SMB> extends PagerAdapter {
    public final SparseArray<LinkedList<VH>> LLILLJJLI = new SparseArray<>(1);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    public abstract int LJJIJIL();

    public abstract int LJJIJL(int i);

    public abstract PhotosViewHolderV3 LJJIJLIJ(int i, int i2, ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return LJJIJIL();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        VH vhPollLast;
        C0SCF c0scf;
        Aweme aweme;
        boolean z;
        Map<String, String> ecommerceClickAnchors;
        Map<String, String> ecommerceClickAnchors2;
        C0SM6 c0sm6LJJI;
        String string;
        Aweme aweme2;
        AwemeRawAd awemeRawAd;
        LeftSlideGuideConfig leftSlideGuideConfig;
        boolean zLJI = MethodIDManager.LJI(196696);
        int iLJJIJL = LJJIJL(i);
        LinkedList<VH> linkedList = this.LLILLJJLI.get(iLJJIJL);
        if (linkedList == null) {
            vhPollLast = LJJIJLIJ(iLJJIJL, i, viewGroup);
            vhPollLast.LL.setTag(R.id.el8, vhPollLast);
        } else {
            vhPollLast = linkedList.pollLast();
            if (vhPollLast == null) {
                vhPollLast = LJJIJLIJ(iLJJIJL, i, viewGroup);
                vhPollLast.LL.setTag(R.id.el8, vhPollLast);
            }
        }
        vhPollLast.LLILLL = i;
        vhPollLast.LLILLJJLI = iLJJIJL;
        viewGroup.addView(vhPollLast.LL);
        C719880SLq c719880SLq = (C719880SLq) this;
        PhotosViewHolderV3 photosViewHolderV3 = (PhotosViewHolderV3) vhPollLast;
        if (i <= c719880SLq.LLJILLL.size()) {
            C0X35.LIZ("ui_to_video_photomode_adapter_vh_bind", false);
            if (i == c719880SLq.LLJILLL.size()) {
                if (photosViewHolderV3 instanceof AdHintPhotoViewHolderV2) {
                    AdHintPhotoViewHolderV2 adHintPhotoViewHolderV2 = (AdHintPhotoViewHolderV2) photosViewHolderV3;
                    VideoItemParams videoItemParamsLJJJJIZL = c719880SLq.LJJJJIZL();
                    if (videoItemParamsLJJJJIZL == null || (aweme2 = videoItemParamsLJJJJIZL.getAweme()) == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (leftSlideGuideConfig = awemeRawAd.getLeftSlideGuideConfig()) == null || (string = leftSlideGuideConfig.getGuideText()) == null) {
                        string = adHintPhotoViewHolderV2.LLJIJIL.getString(2131836454);
                    }
                    TextView textView = (TextView) adHintPhotoViewHolderV2.LLJJL.getValue();
                    if (textView != null) {
                        textView.setText(string);
                    }
                    c719880SLq.LLJILJILJ.put(i, photosViewHolderV3);
                }
                if (c719880SLq.LJJJZ() && (photosViewHolderV3 instanceof PhotoHintViewHolder)) {
                    c719880SLq.LLJILJILJ.put(i, photosViewHolderV3);
                }
                for (C0SMF c0smf : (ArrayList) c719880SLq.LLJJJ) {
                    if (c0smf != null) {
                        c0smf.wd(i);
                    }
                }
                C0X35.LJIIJJI("ui_to_video_photomode_adapter_vh_bind", false);
            } else {
                if (photosViewHolderV3 instanceof VSAMultiPhotoViewHolder) {
                    c719880SLq.LJJIL(i, new AwS137S0201000_11(c719880SLq, photosViewHolderV3, i, 4));
                } else {
                    C719950SLx c719950SLx = new C719950SLx(i, (PhotoModeImageUrlModel) ListProtector.get(c719880SLq.LLJILLL, i), c719880SLq.LJJJJIZL(), c719880SLq.LLJLL, c719880SLq.LJJJLZIJ(i));
                    photosViewHolderV3.SN1(i, c719950SLx);
                    if (((Boolean) C277660AuS.LIZ.getValue()).booleanValue()) {
                        for (C0SMF c0smf2 : (ArrayList) c719880SLq.LLJJJ) {
                            if (c0smf2 != null) {
                                c0smf2.wd(i);
                            }
                        }
                    }
                    c719880SLq.LJJIL(i, new AwS412S0200000_11(photosViewHolderV3, c719950SLx, 102));
                    C0SMF c0smf3 = c719880SLq.LLJJIJIL;
                    if (c0smf3 != null) {
                        c0smf3.wd(i);
                    }
                    if (!c719880SLq.LLILZIL.SC() && (c0scf = c719880SLq.LLJJLIIIJLLLLLLLZ) != null) {
                        c0scf.LG0(i, (FrameLayout) photosViewHolderV3.LL.findViewById(R.id.ega));
                    }
                }
                View view = photosViewHolderV3.LL;
                VideoItemParams videoItemParamsLJJJJIZL2 = c719880SLq.LJJJJIZL();
                String str = null;
                if (videoItemParamsLJJJJIZL2 != null) {
                    aweme = videoItemParamsLJJJJIZL2.getAweme();
                } else {
                    aweme = null;
                }
                if (aweme != null) {
                    InterfaceC1008930cMV interfaceC1008930cMVLJJJJ = c719880SLq.LJJJJ(photosViewHolderV3);
                    if (interfaceC1008930cMVLJJJJ != null && (c0sm6LJJI = interfaceC1008930cMVLJJJJ.LJJI()) != null) {
                        c0sm6LJJI.LJIIIIZZ(i, view, aweme);
                    }
                    try {
                        String aid = aweme.getAid();
                        boolean z2 = true;
                        if (aid == null || aid.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && aweme.getAwemeRawAd() != null) {
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null) {
                                ecommerceClickAnchors = awemeRawAd2.getEcommerceClickAnchors();
                            } else {
                                ecommerceClickAnchors = null;
                            }
                            if (ecommerceClickAnchors != null && !ecommerceClickAnchors.isEmpty()) {
                                z2 = false;
                            }
                            if (!z2) {
                                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                                if (awemeRawAd3 != null) {
                                    ecommerceClickAnchors2 = awemeRawAd3.getEcommerceClickAnchors();
                                } else {
                                    ecommerceClickAnchors2 = null;
                                }
                                ArrayList arrayList = new ArrayList();
                                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                                if (ecommerceClickAnchors2 != null) {
                                    for (Map.Entry<String, String> entry : ecommerceClickAnchors2.entrySet()) {
                                        entry.getKey();
                                        String value = entry.getValue();
                                        try {
                                            AnchorCommonStruct anchorCommonStruct = new AnchorCommonStruct();
                                            anchorCommonStruct.setExtra(value);
                                            arrayList.addAll(iECommerceAnchorService.LJJLIIIJL(anchorCommonStruct));
                                            iECommerceAnchorService.LJL(aweme, arrayList);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c719880SLq.LLJILJILJ.put(i, photosViewHolderV3);
                if (c719880SLq.LJJJIL()) {
                    c719880SLq.LJJL(i);
                }
                for (C0SMF c0smf4 : (ArrayList) c719880SLq.LLJJJ) {
                    if (c0smf4 != null) {
                        c0smf4.wd(i);
                    }
                }
                ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
                if (iSearchService != null) {
                    VideoItemParams videoItemParamsLJJJJIZL3 = c719880SLq.LJJJJIZL();
                    if (videoItemParamsLJJJJIZL3 != null) {
                        str = videoItemParamsLJJJJIZL3.mEventType;
                    }
                    C0SMG c0smgLLJIJIL = iSearchService.LLJIJIL(str);
                    if (c0smgLLJIJIL != null) {
                        c0smgLLJIJIL.LIZ(aweme);
                    }
                }
                C0X35.LJIIJJI("ui_to_video_photomode_adapter_vh_bind", false);
            }
        }
        View view2 = vhPollLast.LL;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return view2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C0SM6 c0sm6LJJI;
        View view = (View) obj;
        C786410Ut5.LJJJLZIJ(view, viewGroup);
        C0SMB c0smb = (C0SMB) view.getTag(R.id.el8);
        C719880SLq c719880SLq = (C719880SLq) this;
        PhotosViewHolderV3 photosViewHolderV3 = (PhotosViewHolderV3) c0smb;
        for (C0SMF c0smf : (ArrayList) c719880SLq.LLJJJ) {
            if (c0smf != null) {
                c0smf.Yb();
            }
        }
        photosViewHolderV3.wY0();
        photosViewHolderV3.LJJIJLIJ();
        C0SMF c0smf2 = c719880SLq.LLJJIJIL;
        if (c0smf2 != null) {
            c0smf2.Yb();
        }
        C0SCF c0scf = c719880SLq.LLJJLIIIJLLLLLLLZ;
        if (c0scf != null) {
            c0scf.SP(i);
        }
        InterfaceC1008930cMV interfaceC1008930cMVLJJJJ = c719880SLq.LJJJJ(photosViewHolderV3);
        if (interfaceC1008930cMVLJJJJ != null && (c0sm6LJJI = interfaceC1008930cMVLJJJJ.LJJI()) != null) {
            c0sm6LJJI.LJIIJ(i);
        }
        c719880SLq.LLJJJJLIIL.LIZJ.remove(Integer.valueOf(i));
        c719880SLq.LLJILJILJ.remove(i);
        int i2 = c0smb.LLILLJJLI;
        LinkedList linkedList = this.LLILLJJLI.get(i2);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.LLILLJJLI.append(i2, (LinkedList<VH>) linkedList);
        }
        linkedList.push(c0smb);
    }
}
