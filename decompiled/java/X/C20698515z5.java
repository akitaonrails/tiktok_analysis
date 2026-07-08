package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.15z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20698515z5 implements InterfaceC20698115z1 {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final EnumC1390800mIQ LLILLL;
    public final FragmentManager LLILZ;
    public final Context LLILZIL;
    public boolean LLILZLL;
    public final C16HJ LLIZ = new C16HJ(this, 2);

    @Override // X.InterfaceC1058150ddt
    public void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC20698115z1
    public void Ol(EnumC715590S5d enumC715590S5d) {
    }

    @Override // X.InterfaceC20698115z1
    public void iQ() {
    }

    @Override // X.InterfaceC20698115z1
    public void kc() {
        LIZ(true);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // X.InterfaceC20698115z1
    public void qu() {
    }

    @Override // X.InterfaceC20698115z1
    public InterfaceC665370Q7z rx() {
        return null;
    }

    @Override // X.InterfaceC20698115z1
    public C160B vf() {
        return null;
    }

    @Override // X.InterfaceC20698115z1
    public boolean w1() {
        return false;
    }

    @Override // X.InterfaceC20698115z1
    public void yu() {
    }

    @Override // X.InterfaceC20698115z1
    public DialogInterface.OnDismissListener aR() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20698115z1
    public Aweme getAweme() {
        return this.LL;
    }

    @Override // X.InterfaceC20698115z1
    public String getEnterFrom() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC20698115z1
    public EnumC1390800mIQ getEnterMethod() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC20698115z1
    public boolean t5() {
        return this.LLILZLL;
    }

    public void LIZ(boolean z) {
        this.LLILZLL = z;
    }

    public C20698515z5(Aweme aweme, String str, EnumC1390800mIQ enumC1390800mIQ, FragmentManager fragmentManager, Context context) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1390800mIQ;
        this.LLILZ = fragmentManager;
        this.LLILZIL = context;
    }
}
