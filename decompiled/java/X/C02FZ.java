package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FZ extends Message<C02FZ, C02N1> {
    public static final ProtoAdapter<C02FZ> ADAPTER = new ProtoAdapter<C02FZ>() { // from class: X.028m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FZ decode(ProtoReader protoReader) {
            C02FZ c02fz = new C02FZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02fz.is_selected = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02fz.button_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fz.button_text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FZ c02fz) {
            C02FZ c02fz2 = c02fz;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c02fz2.button_text) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02fz2.button_name) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02fz2.is_selected) + c02fz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FZ c02fz) {
        }
    };
    public String button_name;
    public C5431029t button_text;
    public Boolean is_selected;

    public C02FZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02N1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
