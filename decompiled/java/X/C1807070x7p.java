package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0x7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807070x7p extends AbstractC1807100x7s<AbstractC1806300x6a> {
    public final InterfaceC1806590x73 LL;
    public final Function0<Unit> LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final ImageView LLILZIL;

    public C1807070x7p(ViewGroup viewGroup, InterfaceC1807160x7y interfaceC1807160x7y, AwS571S0100000_27 awS571S0100000_27) {
        super(R.layout.gqi, viewGroup);
        this.LL = interfaceC1807160x7y;
        this.LLILLJJLI = awS571S0100000_27;
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.h8_);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.h7o);
        this.LLILZIL = (ImageView) this.itemView.findViewById(R.id.h7e);
    }
}
