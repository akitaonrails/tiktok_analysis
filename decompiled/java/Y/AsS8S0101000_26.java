package Y;

import X.AbstractC1585810rMx;
import X.C04CK;
import X.C1746780vYa;
import X.C1748720vbi;
import X.C20635715ox;
import X.DialogC1761330vw3;
import X.DialogC1761350vw5;
import X.InterfaceC1761400vwA;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AsS8S0101000_26 extends AbstractC1585810rMx {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS8S0101000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i) {
        PhotoViewerFragment photoViewerFragment;
        RecyclerView recyclerView2;
        View viewLIZ;
        if (i == 0) {
            int i2 = asS8S0101000_26.i1;
            if ((i2 == 2 || i2 == 1) && (recyclerView2 = (photoViewerFragment = (PhotoViewerFragment) asS8S0101000_26.l0).LL) != null && (viewLIZ = C20635715ox.LIZ(recyclerView2, photoViewerFragment.LLILZIL)) != null) {
                PhotoViewerFragment photoViewerFragment2 = (PhotoViewerFragment) asS8S0101000_26.l0;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    photoViewerFragment2.OR(layoutManager.getPosition(viewLIZ));
                }
            }
        } else {
            if (i == 1) {
                if (asS8S0101000_26.i1 == 0) {
                    ((PhotoViewerFragment) asS8S0101000_26.l0).NR();
                }
            } else if (i == 0) {
            }
            asS8S0101000_26.i1 = i;
        }
        ((PhotoViewerFragment) asS8S0101000_26.l0).LLILLL = false;
        asS8S0101000_26.i1 = i;
    }

    public static final void LJJIIJ$1(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i) {
        String str;
        if (i != 0) {
            if (i == 1) {
                asS8S0101000_26.i1 = 0;
                return;
            }
            return;
        }
        int i2 = asS8S0101000_26.i1;
        if (i2 == 0) {
            return;
        }
        if (i2 > 0) {
            str = "more";
        } else {
            str = "less";
        }
        C1746780vYa c1746780vYa = ((AddressAssociateFragment) asS8S0101000_26.l0).ZR().LLJILJILJ;
        c1746780vYa.getClass();
        AddressAssociateFragment addressAssociateFragment = AddressAssociateFragment.LLJJLIIIJLLLLLLLZ;
        if (addressAssociateFragment == null) {
            return;
        }
        C1748720vbi.LIZIZ(addressAssociateFragment, new C04CK() { // from class: X.0vaF
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("fill_type", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("entrance_form", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("rank", new C1747940vaS[0]));
            }
        }, new AwS140S1100000_26(c1746780vYa, str, 45));
    }

    public static final void LJJIIJ$2(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i) {
        if (i == 0) {
            int i2 = asS8S0101000_26.i1;
            if (i2 == 2 || i2 == 1) {
                DialogC1761350vw5 dialogC1761350vw5 = (DialogC1761350vw5) asS8S0101000_26.l0;
                View viewLIZ = C20635715ox.LIZ(dialogC1761350vw5.LL, dialogC1761350vw5.LLILZIL);
                if (viewLIZ != null) {
                    DialogC1761350vw5 dialogC1761350vw52 = (DialogC1761350vw5) asS8S0101000_26.l0;
                    RecyclerView.ViewHolder childViewHolder = dialogC1761350vw52.LL.getChildViewHolder(viewLIZ);
                    if (!Intrinsics.LJFF(dialogC1761350vw52.LLIZ, childViewHolder)) {
                        dialogC1761350vw52.LLIZ = childViewHolder;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        dialogC1761350vw52.LJJLIIJ(layoutManager.getPosition(viewLIZ));
                    }
                }
            }
        } else {
            if (i == 1) {
                if (asS8S0101000_26.i1 == 0) {
                    Iterator it2 = ((ArrayList) ((DialogC1761330vw3) ((DialogC1761350vw5) asS8S0101000_26.l0)).LLJILJILJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1761400vwA) it2.next()).LIZ();
                    }
                }
            } else if (i == 0) {
            }
            asS8S0101000_26.i1 = i;
        }
        ((DialogC1761350vw5) asS8S0101000_26.l0).LLILLL = false;
        asS8S0101000_26.i1 = i;
    }

    public static final void LJJIIZI$0(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2;
        View viewLIZ;
        PhotoViewerFragment photoViewerFragment = (PhotoViewerFragment) asS8S0101000_26.l0;
        if (!photoViewerFragment.LLILLL && (recyclerView2 = photoViewerFragment.LL) != null && (viewLIZ = C20635715ox.LIZ(recyclerView2, photoViewerFragment.LLILZIL)) != null) {
            PhotoViewerFragment photoViewerFragment2 = (PhotoViewerFragment) asS8S0101000_26.l0;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                photoViewerFragment2.OR(layoutManager.getPosition(viewLIZ));
            }
        }
    }

    public static final void LJJIIZI$1(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i, int i2) {
        asS8S0101000_26.i1 += i2;
    }

    public static final void LJJIIZI$2(AsS8S0101000_26 asS8S0101000_26, RecyclerView recyclerView, int i, int i2) {
        View viewLIZ;
        DialogC1761350vw5 dialogC1761350vw5 = (DialogC1761350vw5) asS8S0101000_26.l0;
        if (!dialogC1761350vw5.LLILLL && (viewLIZ = C20635715ox.LIZ(dialogC1761350vw5.LL, dialogC1761350vw5.LLILZIL)) != null) {
            DialogC1761350vw5 dialogC1761350vw52 = (DialogC1761350vw5) asS8S0101000_26.l0;
            RecyclerView.ViewHolder childViewHolder = dialogC1761350vw52.LL.getChildViewHolder(viewLIZ);
            if (!Intrinsics.LJFF(dialogC1761350vw52.LLIZ, childViewHolder)) {
                dialogC1761350vw52.LLIZ = childViewHolder;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                dialogC1761350vw52.LJJLIIJ(layoutManager.getPosition(viewLIZ));
            }
        }
    }
}
