package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549602Cg extends Message<C549602Cg, C02OK> {
    public static final ProtoAdapter<C549602Cg> ADAPTER = new ProtoAdapter<C549602Cg>() { // from class: X.026U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549602Cg decode(ProtoReader protoReader) {
            C549602Cg c549602Cg = new C549602Cg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c549602Cg.switch_retain_popup_info = C02GQ.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c549602Cg.default_selected = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c549602Cg.backup_tips_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c549602Cg.backup_tips_content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c549602Cg.backup_tips_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549602Cg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549602Cg c549602Cg) {
            C549602Cg c549602Cg2 = c549602Cg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c549602Cg2.backup_tips_title) + protoAdapter.encodedSizeWithTag(2, c549602Cg2.backup_tips_content) + ProtoAdapter.INT32.encodedSizeWithTag(3, c549602Cg2.backup_tips_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c549602Cg2.default_selected) + C02GQ.ADAPTER.encodedSizeWithTag(5, c549602Cg2.switch_retain_popup_info) + c549602Cg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549602Cg c549602Cg) {
        }
    };
    public String backup_tips_content;
    public String backup_tips_title;
    public Integer backup_tips_type;
    public Boolean default_selected;
    public C02GQ switch_retain_popup_info;

    public C549602Cg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
